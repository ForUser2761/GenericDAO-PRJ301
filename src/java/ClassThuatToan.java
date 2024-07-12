
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class ClassThuatToan {

    public static void main(String[] args) {
    }

    /**
     * Hàm này sử dụng để kiểm tra xem 1 số có phải số lẻ hay không
     *
     * @param number
     * @return
     */
    public static boolean kiemTraSoLe(int number) {
        return number % 2 != 0;
    }

    /**
     * Hàm này sử dụng để kiểm tra xem 1 số có phải là số chẵn không
     *
     * @param number
     * @return
     */
    public static boolean kiemTraSoChan(int number) {
        return number % 2 == 0;
    }

    /**
     * Hàm này sử dụng để kiểm tra 1 số có phải là palindrome không ví dụ: 121,
     * 12321, 4554
     *
     * @param number
     * @return
     */
    public static boolean kiemTraPalindrome(int number) {
        if (number < 0) {
            return false; // Negative numbers are not considered palindromes
        }
        int reversed = 0;
        int original = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        return original == reversed;
    }

    /**
     * Hàm này sử dụng để tính fibonacci của 1 số bằng bao nhiêu
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; ++i) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }

    /**
     * Kiểm tra năm nhuận
     *
     * @param year
     * @return
     */
    public static boolean kiemTraNamNhuan(int year) {
        // A leap year is divisible by 4 but not by 100, unless it is also divisible by
        // 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Kiểm tra chuỗi đối xứng
     *
     * @param str
     * @return
     */
    public static boolean kiemTraChuoiDoiXung(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Characters do not match
            }
            i++;
            j--;
        }
        return true; // All characters matched, it's a palindrome
    }

    /**
     * tính tổng số lẻ từ 0 -> số truyền vào
     *
     * @param upto
     * @return
     */
    public static int tinhTongSoLe(int upto) {
        int sum = 0;
        for (int number = 1; number <= upto; number++) {
            if (kiemTraSoLe(number)) {
                sum += number;
            }
        }
        return sum;
    }

    /**
     * tính tổng số chẵn từ 0 -> số truyền vào
     *
     * @param upto
     * @return
     */
    public static int tinhTongSoChan(int upto) {
        int sum = 0;
        for (int i = 0; i <= upto; i++) {
            if (kiemTraSoChan(i)) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * kiểm tra 1 số có phải là số chính phương không
     *
     * @param number
     * @return
     */
    public static boolean kiemTraSoChinhPhuong(int number) {
        if (number < 0) {
            return false; // Negative numbers cannot be perfect squares
        }

        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    /**
     * tìm ước chung lớn nhất của 2 số
     *
     * @param a
     * @param b
     * @return
     */
    public static int timUocChungLonNhat(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Tìm bội số chung nhỏ nhất của 2 số
     *
     * @param a
     * @param b
     * @return
     */
    public static int timBoiSoChungNhoNhat(int a, int b) {
        return Math.abs(a * b) / timUocChungLonNhat(a, b);
    }

    /**
     * tìm ra n số là bội chung nhỏ nhât của 2 số num1 và num2
     *
     * @param num1
     * @param num2
     * @param n
     * @return
     */
    public static List<Integer> findNLCMs(int num1, int num2, int n) {
        int lcm = timBoiSoChungNhoNhat(num1, num2);
        List<Integer> lcmList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            lcmList.add(lcm * i);
        }
        return lcmList;
    }

    /**
     * tìm ước chung nhỏ nhất của 2 số
     *
     * @param a
     * @param b
     * @return
     */
    public static int timUocChungNhoNhat(int a, int b) {
        return a * (b / timUocChungLonNhat(a, b));
    }

    /**
     * code tính tổng các số từ 0 -> số được truyền vào trong java
     *
     * @param number
     * @return
     */
    public static int tinhTongTu0(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * code đảo ngược 1 số
     *
     * @param number
     * @return
     */
    public static int daoNguocSo(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        return reversed;
    }

    /**
     * code tính giai thừa 1 số
     *
     * @param number
     * @return
     */
    public static long tinhGiaiThua(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    /**
     * kiểm tra xem đủ tuổi chưa
     *
     * @param birthDate
     * @param age:      số tuổi bạn muốn kiểm tra
     * @return
     */
    public static boolean kiemTraXemDuTuoiChua(Date birthDate, int age) {
        // Get today's date
        Calendar today = Calendar.getInstance();

        // Get the date for the birth date
        Calendar birthDay = Calendar.getInstance();
        birthDay.setTime(birthDate);

        // Subtract the age from the year field
        birthDay.add(Calendar.YEAR, age);

        // Check if the birth day after adding the age is before or equal to today
        return !birthDay.after(today);
    }

    /**
     * kiểm tra xem chuỗi truyền vào có đủ số lượng kí tự từ min tới max hay
     * không
     *
     * @param input
     * @param min
     * @param max
     * @return
     */
    public static boolean kiemTraXemCoDuSoLuongKiTuKhong(String input, int min, int max) {
        if (input == null) {
            return false; // Null string does not meet any length requirements
        }
        int length = input.length();
        return length >= min && length <= max;
    }

    /**
     * kiểm tra số nguyên tố
     *
     * @param number
     * @return
     */
    public static boolean kiemTraSoNguyenTo(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by another number, so not prime
            }
        }
        return true; // Number is prime
    }

    /**
     * Kiểm tra xem một số có phải là số hoàn hảo không ? Ví dụ số 6, 28, 496,
     * 8128 6 = 1 + 2 + 3
     *
     * @param a
     * @return
     */
    public static boolean kiemtraSoHoanHao(int a) {
        int sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) // tổng các ước số của a
            {
                sum += i;
            }
        }
        if (sum == a) {
            return true;
        }
        return false;
    }

    /**
     * Tính chu vi của hình tam giác.
     *
     * @return chu vi của hình tam giác
     */
    public double calculatePerimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    /**
     * Tính diện tích của hình tam giác sử dụng công thức Heron.
     *
     * @return diện tích của hình tam giác
     */
    public double calculateArea(int sideA, int sideB, int sideC) {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    /**
     * Kiểm tra xem ba cạnh cho trước có thể tạo thành một hình tam giác hay không.
     *
     * @param sideA cạnh thứ nhất của tam giác
     * @param sideB cạnh thứ hai của tam giác
     * @param sideC cạnh thứ ba của tam giác
     * @return true nếu ba cạnh có thể tạo thành một hình tam giác, ngược lại false
     */
    public static boolean isValidTriangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }

    /**
     * Tính diện tích của hình chữ nhật.
     *
     * @param width  chiều rộng của hình chữ nhật
     * @param height chiều dài của hình chữ nhật
     * @return diện tích của hình chữ nhật
     */
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    /**
     * Tính chu vi của hình chữ nhật.
     *
     * @param width  chiều rộng của hình chữ nhật
     * @param height chiều dài của hình chữ nhật
     * @return chu vi của hình chữ nhật
     */
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    /**
     * Tính diện tích của hình thoi.
     *
     * @param diagonal1 đường chéo thứ nhất của hình thoi
     * @param diagonal2 đường chéo thứ hai của hình thoi
     * @return diện tích của hình thoi
     */
    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    /**
     * Tính chu vi của hình thoi.
     *
     * @param side cạnh của hình thoi
     * @return chu vi của hình thoi
     */
    public static double calculateRhombusPerimeter(double side) {
        return 4 * side;
    }

    /**
     * Kiểm tra xem tứ giác với bốn cạnh cho trước có phải là hình thoi hay không.
     *
     * @param sideA cạnh thứ nhất của tứ giác
     * @param sideB cạnh thứ hai của tứ giác
     * @param sideC cạnh thứ ba của tứ giác
     * @param sideD cạnh thứ tư của tứ giác
     * @return true nếu tứ giác là hình thoi, ngược lại false
     */
    public static boolean isRhombus(double sideA, double sideB, double sideC, double sideD) {
        return (sideA == sideB) && (sideB == sideC) && (sideC == sideD);
    }

    /**
     * Tính diện tích của hình tròn.
     *
     * @param radius bán kính của hình tròn
     * @return diện tích của hình tròn
     */
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Kiểm tra xem các điểm cho trước có tạo thành một hình tròn hay không.
     *
     * @param centerX tọa độ x của tâm hình tròn
     * @param centerY tọa độ y của tâm hình tròn
     * @param radius  bán kính dự kiến của hình tròn
     * @param points  các điểm trên đường biên cần kiểm tra
     * @return true nếu tất cả các điểm đều cách tâm một khoảng bằng bán kính, ngược
     *         lại false
     */
    public static boolean isCircle(double centerX, double centerY, double radius, double[][] points) {
        for (double[] point : points) {
            double distance = Math.sqrt(Math.pow(point[0] - centerX, 2) + Math.pow(point[1] - centerY, 2));
            if (Math.abs(distance - radius) > 1e-6) { // Sử dụng ngưỡng nhỏ để so sánh khoảng cách
                return false;
            }
        }
        return true;
    }

    /**
     * Tính chu vi của hình tròn.
     *
     * @param radius bán kính của hình tròn
     * @return chu vi của hình tròn
     */
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * Chuyển đổi một số từ hệ cơ số hiện tại sang hệ cơ số mong muốn.
     *
     * @param number      số cần chuyển đổi dưới dạng chuỗi
     * @param currentBase hệ cơ số hiện tại của số
     * @param targetBase  hệ cơ số muốn chuyển đổi sang
     * @return số đã được chuyển đổi dưới dạng chuỗi
     * @throws NumberFormatException nếu số hoặc hệ cơ số không hợp lệ
     */
    public static String convertBase(String number, int currentBase, int targetBase) throws NumberFormatException {
        // Chuyển đổi số từ hệ cơ số hiện tại sang hệ cơ số 10
        int decimalValue = Integer.parseInt(number, currentBase);

        // Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số mong muốn
        return Integer.toString(decimalValue, targetBase);
    }

    /**
     * Tính khoảng cách giữa hai điểm trong không gian 2D.
     *
     * @param x1 tọa độ x của điểm thứ nhất
     * @param y1 tọa độ y của điểm thứ nhất
     * @param x2 tọa độ x của điểm thứ hai
     * @param y2 tọa độ y của điểm thứ hai
     * @return khoảng cách giữa hai điểm
     */
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Chuyển đổi một chuỗi sao cho tất cả các chữ cái đầu tiên của mỗi từ được in
     * hoa.
     *
     * @param input chuỗi đầu vào
     * @return chuỗi với các chữ cái đầu tiên của mỗi từ được in hoa
     */
    public static String capitalizeFirstLetters(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalizedSentence.toString().trim();
    }

    /**
     * Tìm vị trí đầu tiên của một từ trong một chuỗi.
     *
     * @param sentence chuỗi đầu vào
     * @param word     từ cần tìm vị trí
     * @return vị trí đầu tiên của từ trong chuỗi, hoặc -1 nếu từ không tồn tại
     *         trong chuỗi
     */
    public static int findWordIndex(String sentence, String word) {
        if (sentence == null || word == null) {
            return -1;
        }

        String[] words = sentence.split("\\s+");
        int index = 0;

        for (String w : words) {
            if (w.equals(word)) {
                return index;
            }
            index += w.length() + 1; // Cộng thêm 1 để tính khoảng trắng giữa các từ
        }

        return -1;
    }

    /**
     * Tìm số lần xuất hiện của một từ trong một chuỗi.
     *
     * @param sentence chuỗi đầu vào
     * @param word     từ cần đếm số lần xuất hiện
     * @return số lần xuất hiện của từ trong chuỗi
     */
    public static int countWordOccurrences(String sentence, String word) {
        if (sentence == null || word == null || word.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Tìm số lớn nhất trong một mảng.
     *
     * @param array mảng đầu vào
     * @return số lớn nhất trong mảng, hoặc Integer.MIN_VALUE nếu mảng rỗng hoặc
     *         null
     */
    public static int findMaxInArray(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    /**
     * Tìm số lớn thứ n trong một mảng.
     *
     * @param array mảng đầu vào
     * @param n     thứ tự lớn của số cần tìm (n = 1 nghĩa là số lớn nhất, n = 2
     *              nghĩa là số lớn thứ hai, ...)
     * @return số lớn thứ n trong mảng, hoặc Integer.MIN_VALUE nếu mảng không đủ
     *         phần tử hoặc n không hợp lệ
     */
    public static int findNthLargestInArray(int[] array, int n) {
        if (array == null || array.length < n || n <= 0) {
            return Integer.MIN_VALUE;
        }
        // Sao chép và sắp xếp mảng theo thứ tự giảm dần
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        // Trả về phần tử thứ n từ cuối mảng
        return sortedArray[sortedArray.length - n];
    }
}
