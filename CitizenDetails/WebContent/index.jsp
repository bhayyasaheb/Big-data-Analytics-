<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Citizen Details</title>
</head>
<body>


<form action="CitizenDetailsServlet" method="post">
		<fieldset>
			<legend>Enter Citizen Details</legend>
				<table>
					<tr>
						<td>AadharCardNumber:</td>
						<td> <input type="text" name="adharCardNumber"> </td>
					</tr>
					<tr>
						<td>Name: </td>
						<td><input type="text" name="name"> </td>
					</tr>	
					<tr>
						<td>Gender:</td>
						<td> <input type="radio" name="gender" value="Male">Male
							 <input type="radio" name="gender" value="Female">Female </td>
					</tr>
					<tr>
						<td>DOB:</td>
						<td><input type="text" name="dob"></td>
					</tr>
					<tr>
						<td>Age: </td>
						<td><input type="text" name="age"></td>
					</tr>
					<tr>
						<td>Address: </td>
						<td><input type="text" name="address"></td>
					</tr>
					<tr>
						<td>City: </td>
						<td><select name="city">
							<option value="">Select</option>
    						<option value="Mumbai">Mumbai</option>
						    <option value="Hydrabad">Hydrabad</option>
						    <option value="Pune">Pune</option>
						    <option value="Chennai">Chennai</option>
						    <option value="Banglore">Banglore</option>
						    <option value="Delhi ">Delhi</option>
						    <option value="Satara">Satara</option>
						    <option value="Kolkata">Kolkata</option>
						</select></td>
					</tr>
					<tr>
						<td>Country: </td>
						<td><select name="country">
							<option value="">Select</option>
    						<option value="India">India</option>
						</select></td>
					</tr>
					<tr>
						<td>Pincode:</td>
						<td><input type="text" name="pincode"></td>
					</tr>
					<tr>
						<td>Phone:</td>
						<td><input type="text" name="phone"></td>
					</tr>
					<tr>
						<td>Education Details</td>
						<td>
							<input type="checkbox" name="edetails" value="SSC">SSC
							<input type="checkbox" name="edetails" value="HSC">HSC
							<input type="checkbox" name="edetails" value="Graduation">Graduation
							<input type="checkbox" name="edetails" value="PostGraduation">PostGraduation
							<input type="checkbox" name="edetails" value="PHD">PHD
						</td>
					</tr>
					
					<tr>
						<td>WorkingStatus: </td>
						<td><input type="text" name="workingStatus"></td>
					</tr>
					
					<tr>
						<td>MaritalStatus: </td>
						<td><input type="text" name="maritalStatus"></td>
					</tr>
					
					<tr>
						<td>Salary: </td>
						<td><input type="text" name="salary"></td>
					</tr>
					
					<tr>
						<td>NumberOfDependents: </td>
						<td><input type="text" name="numberOfDependents"></td>
					</tr>
					
					
					<tr><td></td><td><input type="submit" value="Submit"></td></tr>		   
				</table>
		</fieldset>		   
	</form>



</body>
</html>