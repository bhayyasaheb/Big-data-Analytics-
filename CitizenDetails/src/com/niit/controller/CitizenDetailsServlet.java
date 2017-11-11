package com.niit.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CitizenDetailsServlet")
public class CitizenDetailsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
				// what kind of data is send to the client
				response.setContentType("text/html");
				
				// To send response back to the client
				PrintWriter out = response.getWriter();
				
				// getting data from jsp page and storing it in local variable
				String adharCardNumber = request.getParameter("adharCardNumber");
				String name = request.getParameter("name");
				String gender = request.getParameter("gender");
				String dob = request.getParameter("dob");
				String age = request.getParameter("age");
				String address = request.getParameter("address");
				String city = request.getParameter("city");
				String country = request.getParameter("country");
				String pincode = request.getParameter("pincode");
				String phone = request.getParameter("phone");		       
				String workingStatus = request.getParameter("workingStatus");
				String maritalStatus = request.getParameter("maritalStatus");
				String salary = request.getParameter("salary");
				String numberOfDependents = request.getParameter("numberOfDependents");
				String[] edetails =  request.getParameterValues("edetails");
				
				// creating an empty ArrayList	
				ArrayList<String> al = new ArrayList<String>();
				
				// if adharCardNumber if null or empty 
				if(adharCardNumber == null || adharCardNumber.equals(""))
				{
					al.add("Please enter Adhar Card Number must not null or blank! ");
				}
				
				// if name if null or empty 
				if(name == null || name.equals(""))
				{
					al.add("Please name must not null or blank! ");
				}
				
				// if gender is not selected or is null or empty
				if(gender == null || gender.equals(""))
				{
					al.add("Please select gender as Male or Female option! ");
				}
				
				// if date of birth have more than 8 digit
				try
				{
					if(dob.length() > 8)
					{
						al.add("Please enter date of birth sould not exceed 8 digit! ");
					}
				}
				catch(Exception e)
				{
					al.add("Please enter the date of birth! ");
				}
				
				// if age is character or string and null or empty
				if((!age.matches("[0-9]+")) || age == null || age.equals("") )
				{
					al.add("Please enter age in numbers not in letters and age must not be null or empty! ");
				}
				
				// if address is not given or null or empty
				if(address.equals("") || address == null)
				{
					al.add("Please enter address! ");
				}
				
				// if city is not selected or empty or null
				if(city.equals("") || city == null)
				{
					al.add("Please select city! ");
				}
				
				// if country is not selected or null or empty
				if(country.equals("") || country == null)
				{
					al.add("Please select Country! ");
				}
				
				// if pincode is not given or empty or null
				if(pincode.equals("") || pincode == null)
				{
					al.add("Please enter pincode! ");
				}

				// if phone is not given or empty or null
				if(phone.equals("") || phone == null)
				{
					al.add("Please enter phone! ");
				}
				
				// if workingStatus is  given but not in Yes or no
				if(!(workingStatus.contains("Yes") || workingStatus.contains("No")))
				{
					al.add("Please enter Working Status like Yes or No! ");
				}
				
				// if maritalStatus is  given but not in Yes or no
				if(!(maritalStatus.contains("Yes") || maritalStatus.contains("No")))
				{
					al.add("Please enter Marital Status like Yes or No ! ");
				}
				
				// if salary is given -ve or 0 or null
				if(salary.startsWith("-") || salary == null || salary.equals("0"))
				{
					al.add("Please enter salary in positive and not zero! ");
				}
				
				// if numberOfDependents is not given or empty or null
				if(numberOfDependents.equals("") || numberOfDependents == null)
				{
					al.add("Please enter number of Dependents! ");
				}
				
				// for validation of fields it will shows error message 
				if(al.size() != 0)
				{
					out.println(al);
					System.out.println("Opps! \n" + al);
				}
				else
				{
					try {
						// File to create a new file
						File file = new File("D:\\Oxygen Workpace\\CitizenDetails\\WebContent\\CitizenDetails.txt");
						
						// if file  created already then append data in that file
						FileWriter fwrite = new FileWriter(file,true);
						
						// Write a data in a file
						PrintWriter pw = new PrintWriter(fwrite);
						
						pw.print(adharCardNumber+", " );
						pw.print(name+", ");
						pw.print(gender+", ");
						pw.print(dob+", ");
						pw.print(age+", ");
						pw.print(address+", ");
						pw.print(city+", ");
						pw.print(country+", ");
						pw.print(pincode+", ");
						pw.print(phone+", ");
						pw.print(workingStatus+", ");
						pw.print(maritalStatus+", ");
						pw.print(salary+", ");
						pw.print(numberOfDependents);
						
						try {
							
							// adding all education details values to ArrayList and writing in a file
							for(String education: edetails)
							{
								pw.print(", "+education);
								//al.add(education);
							}
							//pw.print(al);
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						
						pw.println();
						
						// to give the guarantee that total data including last character will be written to the file
						pw.flush();
						
						// to close writer object
						pw.close();
						System.out.println("Indian Citizen Details are stored Successfully!, Thank you!");
						
						//out.println("Indian Citizen Details Sorted successfully, Thank you!");
						
						// forwarding request to success.jsp page
						RequestDispatcher rd = getServletContext().getRequestDispatcher("/success.jsp");
						rd.forward(request, response);
						
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				
	}

}
