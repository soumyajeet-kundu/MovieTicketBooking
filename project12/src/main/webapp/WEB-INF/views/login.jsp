<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<pre>${msg}</pre>
<form action="checkuser" method="post"><br>
<center><h2>Enter login credentials</h2>
<table class="container" id="table1" border="1" cellpadding="4" style="width:400px">
<tbody style= "text-align: center">
                    <tr>
                        <td id="th">User-Name</td>
                        <td id="th"><input type="text" name="email" value="" placeholder="Enter your Email id" required/></td>
                    </tr>
                    <tr>
                        <td id="th">Password</td>
                        <td id="th"><input type="Password" name="pass" value="" required/></td>
                    </tr>
                    </tbody>
                    </table>
<!-- User-name : <input type="text" name="name" placeholder="Enter your Email id"><br><br>
Password : <input type="password" name=""><br><br> -->

<br><input type="submit" value="Login" class="btn btn-success" role="button"></center>



</form>

</body>
</html> 