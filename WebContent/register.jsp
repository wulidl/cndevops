<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Register</title>
	<script type="text/javascript">
	        function validate_form(thisform) {
	        	//alert ("hello");
		        if (thisform.new_user_name.value==""){
		        	alert ("Please enter your name");
		        	return false;
		        }
		        if (thisform.new_user_password.value==""){
		        	alert ("please enter your password");
		        	return false;
		        }
		        return true;
	        }
        </script>
</head>
<body>
	<form action="RegisterServlet" onsubmit="return validate_form(this)" method=post>
		<p>
			username: <input type="text" name="new_user_name">
		</p>
		<p>
			password: <input type="password" name="new_user_password">
		</p>
		<input type="submit" value="Register">
	</form>
</body>
</html>