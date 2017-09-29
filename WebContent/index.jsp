<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script type="text/javascript">
	        function validate_form(thisform) {
	        	//alert ("hello");
		        if (thisform.username.value==""){
		        	alert ("Please enter your name");
		        	return false;
		        }
		        if (thisform.password.value==""){
		        	alert ("please enter your password");
		        	return false;
		        }
		        return true;
	        }
        	function goReg() {
        		window.location.href = "register.jsp";
        	}
        </script>
    </head>
    <body>
        <h3> Please login:</h3>
        <form action="LoginServlet" onsubmit="return validate_form(this)" method=post>
            <p>username: <input type="text" id="username" name="username"></p>
            <p>password: <input type="password" id="password" name="password"></p>
            <input type="submit" value="Login">
            <input type="button" value="Register" onclick="goReg()"> 
        </form>
    </body>
</html>

