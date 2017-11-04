<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
	<form action="FirstServlet" method="post">
		<fieldset>
			<legend>Enter Customer Details</legend>
				<table>
					<tr>
						<td>Customer Id:</td>
						<td> <input type="text" name="id"> </td>
					</tr>
					<tr>
						<td>Customer Name: </td>
						<td><input type="text" name="name"> </td>
					</tr>	
					<tr>
						<td>Customer Gender:</td>
						<td> <input type="radio" name="gender" value="Male">Male
							 <input type="radio" name="gender" value="Female">Female </td>
					</tr>
					<tr>
						<td>Customer DOB:</td>
						<td><input type="text" name="dob"></td>
					</tr>
					<tr>
						<td>Customer Age: </td>
						<td><input type="text" name="age"></td>
					</tr>
					<tr>
						<td>Customer Address: </td>
						<td><input type="text" name="address"></td>
					</tr>
					<tr>
						<td>Customer City: </td>
						<td><select name="city">
							<option value="">Select</option>
    						<option value="Mumbai">Mumbai</option>
						    <option value="Hydrabad">Hydrabad</option>
						    <option value="Hong Kong">Hong Kong</option>
						    <option value="Shanghai ">Shanghai</option>
						    <option value="Oxford ">Oxford</option>
						    <option value="London ">London</option>
						    <option value="Boston">Boston</option>
						    <option value="Las Vegas">Las Vegas</option>
						    <option value="Sydney">Sydney</option>
						    <option value="Darwin">Darwin</option>
						</select></td>
					</tr>
					<tr>
						<td>Customer Country: </td>
						<td><select name="country">
							<option value="">Select</option>
    						<option value="India">India</option>
						    <option value="China">China</option>
						    <option value="UK">UK</option>
						    <option value="USA">USA</option>
						    <option value="Australia">Australia</option>
						</select></td>
					</tr>
					<tr>
						<td>Customer Pincode:</td>
						<td><input type="text" name="pincode"></td>
					</tr>
					<tr>
						<td>Customer Phone:</td>
						<td><input type="text" name="phone"></td>
					</tr>
					<tr>
						<td>Customer Area of Interest:</td>
						<td>
							<input type="checkbox" name="interests" value="Playing">Playing
							<input type="checkbox" name="interests" value="Reading">Reading
							<input type="checkbox" name="interests" value="Painting">Painting
							<input type="checkbox" name="interests" value="Photography">Photography
							<input type="checkbox" name="interests" value="Traveling">Traveling
						</td>
					</tr>
					
					<tr><td></td><td><input type="submit" value= "Submit"></td></tr>		   
				</table>
		</fieldset>		   
	</form>
</body>
</html>