<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Welcome</title>
    </head>
    <body>
       Welcome to Tutorials

       <form action="add">
            Enter 1st Number : <input type="number" name="num1"><br>
            Enter 2nd Number : <input type="number" name="num2"><br>
            <button type="submit">Submit</button>
       </form>

       <form action="addAlien">
        Enter your id : <input type="number" name="aid"><br>
        Enter your name : <input type="text" name="aname"><br>
        <button type="submit">Submit</button>
   </form>
    </body>
</html>