<%@page import="model.User"%>
<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 
<jsp:useBean id="user" type="model.User" scope="request" />
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>Cardone Indexing/QA Login</title>
    </head>
 
    <body>
        <form method="POST" action="login.html">
            Username: <input type="text" name="userName" />
            Password: <input type="password" name="password" />
            <input type="submit" value="Login" />
        </form>
     </body>
 </html>