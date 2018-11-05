<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css"/>   <%-- /resources/   is a logical name (variable) defined in dispatcher-servlet.xml with phisic location="/assets/"--%>
<spring:url var="js" value="/resources/js"/>   <%-- /resources/   is a logical name (variable) defined in dispatcher-servlet.xml with phisic location="/assets/"--%>
<spring:url var="images" value="/resources/images"/>   <%-- /resources/   is a logical name (variable) defined in dispatcher-servlet.xml with phisic location="/assets/"--%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>



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
                <th>Last Name</th>
            </tr>
            <tr>
                <td>Ячейка 3</td>
                <td>Ячейка 4</td>
            </tr>

        </table>


    </div>

    <!-- Footer -->
    <%@include file="shared/footer.jsp"%>

    <!-- jQuery JavaScript -->
    <script src="${js}/jquery.js"></script>

    <!-- jQuery-validation -->
    <script src="${js}/jquery.validate.js"></script>

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/bootstrap.js"></script>

    <%--<script src="${contextRoot}/assets/js/bootstrap.bundle.js"></script>--%>
    <!-- DataTable Plugin -->
    <script src="${js}/jquery.dataTables.js"></script>

    <!-- DataTable Bootstrap JavaScript -->
    <script src="${js}/dataTables.bootstrap4.js"></script>

    <!-- BootBox JavaScript -->
    <script src="${js}/bootbox.min.js"></script>

    <!-- Self coded JavaScript -->
    <script src="${js}/myapp.js"></script>

</div>

</body>

</html>

