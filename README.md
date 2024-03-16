# BÍ KÍP PRJ301 - PRJ302 CÁC CƠ SỞ ( 4USER)

Thi cử càng ngày càng khó khăn, cấu trúc đề có nhiều sự thay đổi, tool tủng cũng hoành hành ngày càng nhiều nhưng mà ở đây mình vẫn khuyến khích các bạn học thật, thi thật hơn. Đây sẽ là repo hỗ trợ các bạn làm bài tập nhanh hơn, tất cả các class đều đã được đơn giản hóa, có comment đầy đủ bằng tiếng Việt cho các bạn đọc để hiểu tác dụng của hàm là gì.


<p align="center">
  <img src="readme/foru%20png.png" alt="App Screenshot" width="50%"/>
</p>

## Hướng dẫn tải về
![App Screenshot](readme/huong%20dan%20tai%20ve.jpg)
Bạn nào biết clone code về thì không nói, còn nếu biết rồi thì hãy bấm vào theo như ảnh trên để tải về

## Hướng dẫn sử dụng

### Class thuật toán
Trong class thuật toán hiện tại đang có các phương thức như sau
| Method |    Description                |
| :-------- | :------------------------- |
| `kiemTraSoLe` | Hàm này sử dụng để kiểm tra xem 1 số có phải số lẻ hay không |
| `kiemTraSoChan` | Hàm này sử dụng để kiểm tra xem 1 số có phải là số chẵn không |
| `kiemTraPalindrome` | Hàm này sử dụng để kiểm tra 1 số có phải là palindrome không ví dụ: 121, 12321, 4554 |
| `fibonacci` | Hàm này sử dụng để tính fibonacci của 1 số bằng bao nhiêu |
| `kiemTraNamNhuan` | Kiểm tra xem 1 năm có phải năm năm nhuận hay không |
| `kiemTraChuoiDoiXung` | Kiểm tra chuỗi đối xứng |
| `tinhTongSoLe` | tính tổng số lẻ từ 0 -> số truyền vào |
| `tinhTongSoChan` | tính tổng số chẵn từ 0 -> số truyền vào |
| `kiemTraSoChinhPhuong` | kiểm tra 1 số có phải là số chính phương không |
| `timUocChungLonNhat` | tìm ước chung lớn nhất của 2 số |
| `timUocChungLonNhat` | tìm ước chung lớn nhất của 2 số |
| `timUocChungNhoNhat` | tìm ước chung nhỏ nhất của 2 số |
| `tinhTongTu0` | code tính tổng các số từ 0 -> số được truyền vào trong java |
| `daoNguocSo` | code đảo ngược 1 số |
| `tinhGiaiThua` | code tính giai thừa 1 số |
| `kiemTraXemDuTuoiChua` | kiểm tra xem đủ tuổi chưa |
| `kiemTraXemCoDuSoLuongKiTuKhong` | kiểm tra xem chuỗi truyền vào có đủ số lượng kí tự từ min tới max hay không |
| `kiemTraSoNguyenTo` | kiểm tra số nguyên tố |

### GenericDAO
`` Bạn nào học trong khóa PRJ301 của mình rồi thì chắc cũng biết về quy tắc để sử dụng file này, nên mình không nói lại nữa ``

| Parameter |    Description                |
| :-------- | :------------------------- |
| `queryGenericDAO` | Lấy về toàn bộ dữ liệu của 1 bảng |
| `queryGenericDAO(String sql)` | Lấy về toàn bộ dữ liệu của 1 bảng nhưng kèm thêm câu lệnh - có thể tùy biến câu lệnh theo ý thích được |
| `updateGenericDAO(String sql)` | update dữ liệu của 1 bảng kèm thêm câu lệnh - có thể tùy biến câu lệnh theo ý thích được |
| `deleteGenericDAO(String sql)` | Xóa dữ liệu của 1 bảng kèm thêm câu lệnh - có thể tùy biến câu lệnh theo ý thích được |
| `insertGenericDAO(String sql)` | Thêm dữ liệu vào 1 bảng kèm thêm câu lệnh - có thể tùy biến câu lệnh theo ý thích được |
| `findTotalRecordGenericDAO(String sql)` | tìm số bản ghi của 1 bảng kèm thêm câu lệnh - có thể tùy biến câu lệnh theo ý thích được |
| `findTotalRecordGenericDAO()` | tìm số bản ghi của 1 bảng |

