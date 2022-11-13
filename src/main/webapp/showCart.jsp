<%@ page import="com.example.javaee.javaee.model.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Akobek
  Date: 13.11.2022
  Time: 7:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
</head>
<body>
<%
    Cart cart = (Cart) session.getAttribute("cart");
%>
<p><%="Наименование: " + cart.getName()%></p>
<p><%="Количество: "+cart.getQuantity()%></p>
</body>
</html>
