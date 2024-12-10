<%@ page import="com.example.baithigiuaki.Employee" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: tamdz
  Date: 12/10/2024
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<form action="employee" method="get">
    <table style="border: 2px solid black ;width: 500px">
        <thead>
        <tr style="padding: 20px">
            <th>id</th>
            <th>hoTen</th>
            <th>tuoi</th>
            <th>vitri</th>
            <th>phongBan</th>
            <th>luong</th>
        </tr>
        </thead>
    </table>
    <tboddy>
        <c:forEach var="employeeList" items="${employeeList}">

            <tr>
                <td style="padding-left: 35px">${employeeList.id}</td>
                <td style="padding-left: 35px">${employeeList.hoTen}</td>
                <td style="padding-left: 45px">${employeeList.tuoi}</td>
                <td style="padding-left: 50px">${employeeList.viTri}</td>
                <td style="padding-left: 50px">${employeeList.phongBan}</td>
                <td style="padding-left: 50px">${employeeList.luong}</td>
            </tr>
        </c:forEach>

    </tboddy>
</form>
</body>
</html>
