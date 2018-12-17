<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Hello World!
    <table border="1">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>mobile</td>
            <td>email</td>
            <td>city</td>
            <td>birthday</td>
        </tr>
        <c:forEach items="${requestScope.people}" var="pe">
            <tr>
                <td>${pe.id}</td>
                <td>${pe.name}</td>
                <td>${pe.mobile}</td>
                <td>${pe.email}</td>
                <td>${pe.city}</td>
                <td>${pe.birthday}</td>
            </tr>
        </c:forEach>

    </table>
</h2>
</body>
</html>
