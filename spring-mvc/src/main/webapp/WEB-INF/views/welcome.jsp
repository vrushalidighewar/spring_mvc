<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <!-- <font color="ORANGE"><b> HELLO WORLD </b> </font> -->
       <font color="ORANGE"><b>${msg}</b></font>
       
       <form action="login" method="post" >
       Enter Username:<input type="text" name="userName"><br><br>
       Enter Password:<input type="password" name="password"><br><br>
       <input type="submit" value="login"> 
       </form>
       
       <c:forEach items="${names}" var="a">
       <c:out value="${a}"/>
       </c:forEach>
       <a href="signup">Create Account</a>
       
</body>
</html>