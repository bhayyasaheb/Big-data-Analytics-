<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Transaction Details</title>
</head>
<body>
	
	<form action="CustomerTransactionDetails" method="post">
		<fieldset>
			<legend>Enter Customer Transaction Details</legend>
				<table>
					<tr>
						<td>Customer Id:</td>
						<td> <input type="text" name="cId"> </td>
					</tr>
					<tr>
						<td>Customer Name: </td>
						<td><input type="text" name="cName"> </td>
					</tr>	
					<tr>
						<td>Customer Age:</td>
						<td><input type="text" name="cAge"> </td>
					</tr>
					<tr>
						<td>Customer Profession:</td>
						<td><input type="text" name="cProfession"></td>
					</tr>
					<tr>
						<td>Annual Salary:</td>
						<td><input type="text" name="cSalary"></td>
					</tr>
					
					<tr>
						<td>Transaction Id:</td>
						<td> <input type="text" name="tId"> </td>
					</tr>
					<tr>
						<td>Transaction Date: </td>
						<td><input type="text" name="tDate"> </td>
					</tr>	
					<tr>
						<td>Transaction Amount:</td>
						<td><input type="text" name="tAmount"></td>
					</tr>
					<tr>
						<td>Product Category:</td>
						<td><select name="pCategory">
							<option value="">Select</option>
    						<option value="Sports">Sports</option>
    						<option value="Appeareals">Appeareals</option>
    						<option value="Home Appliances">Home Appliances</option>
    						<option value="Kitchen Appliances">Kitchen Appliances</option>
    					</select></td>	
					</tr>
					
					<tr>
						<td>Product Name:</td>
						<td><input type="text" name="pName"></td>
					</tr>
					
					<tr>
						<td>Transaction Mode:</td>
						<td><select name="tMode">
							<option value="">Select</option>
    						<option value="Cash">Cash</option>
    						<option value="CreditCard">CreditCard</option>
    						<option value="Net Banking"> Net Banking</option>
    						<option value="DebitCard">DebitCard</option>
    					</select></td>
					</tr>
					
					<tr><td></td><td><input type="submit" value="Submit"></td></tr>		   
				</table>
		</fieldset>		   
	</form>
	
</body>
</html>