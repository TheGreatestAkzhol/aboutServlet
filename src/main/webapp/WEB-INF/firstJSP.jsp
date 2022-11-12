<%--
  Created by IntelliJ IDEA.
  User: Akobek
  Date: 13.11.2022
  Time: 4:45
  To change this template use File | Settings | File Templates.
--%>
<%--Java Server Page - jsp--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>
<%--Как писать джава код в JSP--%>
<%
  java.util.Date now = new java.util.Date();
  String someString = "Текущая дата: "+ now;
%>
<%--Как импортить в JSP--%>
<%@ page import="java.util.Collection" %>
<%--Как сразу выводить в JSP--%>
<p>
  <%= "Hello world"%>
  <%= new java.util.Date()%>
  <%= someString%>
</p>
<%--Еще один способ моментального вывода--%>
<p>
  <%
    out.println("Hello world ");
  %>
</p>
<%@page import="com.example.javaee.javaee.logic.TestClass" %>
<%
  TestClass testClass = new TestClass();
  String someString1 = testClass.getInfo();
%>
<p>
<%=someString1%>
</p>
</body>
</html>
