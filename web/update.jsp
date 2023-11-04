<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food List Page</title>
    </head>
    <body>
        <!--your code here-->
        <br/>
        <br/>
        <br/>
        <table border="1">
            <thead>
                <tr>
                    <th>No</th>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>thẻ radio button</th>
                    <th>thẻ select</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%--<c:forEach items="${list}" var="m" varStatus="i">--%>
                <tr>
                </tr>
                <%--</c:forEach>--%> 
                <tr>
                    <td>ABC</td>
                    <td name="id">XYZ</td>
                    <td name="name">ABC</td>
                    <td name="description">ABC</td>
                    <td name="gender">Male</td>
                    <td name="class">Lop 1</td>
                    <td>
                        <button type="button" onclick="update(this)">Update</button>
                    </td>
                </tr>
                <tr>
                    <td>XYZ</td>
                    <td name="id">XYZ</td>
                    <td name="name">ABC</td>
                    <td name="description">ABC</td>
                    <td name="gender">Female</td>
                    <td name="class">Lop 2</td>
                    <td>
                        <button type="button" onclick="update(this)">Update</button>
                    </td>
                </tr>
            </tbody>
        </table>

        <form id="updateForm" action="your_action" style="display: none;">
            <h1> Update </h1>
            <!--            <input type="text" name="action" value="update"
                               style="display: none"/>-->
            ID: <input type="text" id="updateId" name="id" />
            <br/>

            Name: <input type="text" id="updateName" name="name" />
            <br/>

            Description: <input type="text" id="updateDescription" name="description" />
            <br/>
            <!-- Radio Buttons for Gender -->
            Gender:
            <input type="radio" id="male" name="gender" value="Male"> Male
            <input type="radio" id="female" name="gender" value="Female"> Female
            <br/>


            Classes <select name="classes">
                <option value="">Lop 1</option>
                <option value="">Lop 2</option>
            </select>
            <br/>
            <input type="submit" value="Submit" />
        </form>
    </body>
    <script>
        function update(row) {
            // Get the form and toggle its visibility
            var form = document.getElementById('updateForm');
            form.style.display = form.style.display === 'none' ? 'block' : 'none';

            // Check if the form is now visible
            if (form.style.display === 'block') {
                // Get the row that was clicked
                var currentRow = row.closest('tr');

                // Use querySelector with the name attribute to get the data
                var id = currentRow.querySelector('[name=id]').textContent;
                var name = currentRow.querySelector('[name=name]').textContent;
                var description = currentRow.querySelector('[name=description]').textContent;
                var gender = currentRow.querySelector('[name=gender]').textContent;
                var classValue = currentRow.querySelector('[name=class]').textContent;

                // Assign the values to the form inputs
                document.getElementById('updateId').value = id;
                document.getElementById('updateName').value = name;
                document.getElementById('updateDescription').value = description;

                // Set the radio buttons
                document.getElementById('male').checked = (gender === 'Male');
                document.getElementById('female').checked = (gender === 'Female');

                // Set the select option
                var selectElement = form.querySelector('[name=classes]');
                for (var i = 0; i < selectElement.options.length; i++) {
                    if (selectElement.options[i].textContent === classValue) {
                        selectElement.selectedIndex = i;
                        break;
                    }
                }
            }
        }

    </script>
</html>
