<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Details</title>
</head>
<body>
	
	<form action="MovieDetailsServlet" method="post">
		<fieldset>
			<legend>Enter Movie Details</legend>
				<table>
					<tr>
						<td>Movie Id:</td>
						<td> <input type="text" name="id"> </td>
					</tr>
					<tr>
						<td>Movie Name: </td>
						<td><input type="text" name="name"> </td>
					</tr>	
					<tr>
						<td>Release Date:</td>
						<td><input type="text" name="releaseDate"> </td>
					</tr>
					<tr>
						<td>Rating:</td>
						<td><input type="text" name="rating"></td>
					</tr>
					<tr>
						<td>Movie Duration (in Sec):</td>
						<td><input type="text" name="duration"></td>
					</tr>
					
					<tr><td></td><td><input type="submit" value="Submit"></td></tr>		   
				</table>
		</fieldset>		   
	</form>
	
</body>
</html>