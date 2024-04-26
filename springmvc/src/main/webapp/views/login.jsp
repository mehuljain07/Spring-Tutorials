<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
       <h1>Login</h1>
       ${SPRING_SECURITY_LAST_EXCEPTION.message}
       <form action="login" method="post">
            <table>
            	<tr>
            		<td>User:</td>
            		<td><input type="text" name="username" value=""></td>
            	</tr>
            	<tr>
            		<td>Password:</td>
            		<td><input type="password" name="password" value=""></td>
            	</tr>
            	<tr>
            		<td><input type="submit" name="submit" value="Submit"></td>
            	</tr>
            </table>
            
       </form>

       
    </body>
</html>