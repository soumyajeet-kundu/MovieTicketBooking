<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        #table1{
 			 border-collapse: collapse;
 			 width: 450px;
			}
		#th{
 			text-align: center;
 			}
 			
        </style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="adduser" method="post">

<table class="container" id="table1" border="1" cellpadding="4">
                <thead>
                <br><br>
                    <tr>
                        <th colspan="2" id="th" >User Registration</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td id="th">User Name</td>
                        <td id="th"><input type="text" name="uname" value="" required/></td>
                    </tr>
                    <tr>
                        <td id="th">Password</td>
                        <td id="th"><input type="password" name="pass" value="" required/></td>
                    </tr>
                    <tr>
                        <td id="th">Name</td>
                        <td id="th"><input type="text" name="name" value="" required/></td>
                    </tr>
                    <tr>
                        <td id="th">Email</td>
                        <td id="th"><input type="text" name="email" value="" required/></td>
                    </tr>
                    <tr>
                        <td id="th">Mobile</td>
                        <td id="th"><input type="text" name="mobile" value="" required/></td>
                    </tr>
                    <tr>
                        <td id="th"><input type="submit" value="Register" class="btn btn-info" /></td>
                        <td id="th"><input type="reset" value="Reset" class="btn btn-success"/></td>
                    </tr>
                    <!-- <tr>
                        <td colspan="2" id="th"><b>Already registered!! </b><a href="index.jsp">&nbsp;Login Here</a></td>
                    </tr> -->
                </tbody>
            </table>
<!-- User Name: <input type="text" name="uname"><br><br>
Password: <input type="text" name="pass"><br><br>
Name: <input type="text" name="name"><br><br>
Email : <input type="email" name="email"><br><br>
Mobile: <input type="text" name="mobile"><br><br>
<input type="submit" value="Register"><br><br> -->
</form>
</body>
</html>