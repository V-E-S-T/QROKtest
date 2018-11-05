<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>${title}</title>

</head>

<body>

    <div>

        <table border="1">

            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
                <th>Books</th>
            </tr>
            <tr>
                <td>${authorDTO.firstName}</td>
                <td>${authorDTO.lastName}</td>
                <td>${authorDTO.age}</td>
                <td>${authorDTO.listBook}</td>
            </tr>

        </table>

    </div>

</body>

</html>

