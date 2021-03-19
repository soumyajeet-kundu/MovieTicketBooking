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
<form action="addaudi" method="post">
<center><h2>Enter Screen Details</h2>
<table class="container" id="table1" border="1" cellpadding="4" style="width:400px">
<tbody style= "text-align:center">
					<tr>
                        <td id="th">Screen Name:</td>
                        <td id="th"><input type="text" name="auname" value="" required/></td>
                    </tr>
                    <tr>
                        <td id="th">Screen Id:</td>
                        <td id="th"><input type="number" name="auid" value="" required/></td>
                    </tr>
                    <tr>
                        <td id="th">Seats:</td>
                        <td id="th"><input type="number" name="seats" value="" required/></td>
                    </tr>

	</tbody>
</table><br>
<input type="submit" value="Add Screen" class="btn btn-info" role="button"></center>

</form>
</body>
</html>