<%-- 
    Document   : newjsp
    Created on : Nov 6, 2016, 10:35:27 PM
    Author     : Janghun
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="salaryInfo" class="web.Salary" scope="page"/>
<jsp:setProperty property="*" name="salaryInfo"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>J's Page</title>
    </head>
    <body>
        <h1>Monthly pay</h1>
        Monthly : <jsp:getProperty property="month" name="salaryInfo"/> $<br>
        Daily   : <%= salaryInfo.getDaily()%> <br>
        Year    : <%= salaryInfo.getYear()%> <br>
    </body>
</html>
