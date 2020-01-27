<%-- 
    Document   : login
    Created on : Mar 26, 2019, 9:24:01 AM
    Author     : Khadijat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NIIT STUDENT ADMISSION FORM</title>
    </head>
    <body>
        <form action="/ClassWork3_FristSpring/submitLogin.soft" method="post">
            <p>
                Student's Name: <input type="text" name="studentName">
            </p>
             <p>
                Student's AGE: <input type="number" name="studentAGE">
            </p>
            <p>
                Student's Location: <input type="text" name="studentLocation">
            </p>
            
            <input type="submit" value="Submit the Form">        
        </form>        
    </body>
</html>
