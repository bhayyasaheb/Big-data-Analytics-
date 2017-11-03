package com.niit.customer;

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


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// what kind of data is send to the client
		response.setContentType("text/html");
		
		// To send response back to the client
		PrintWriter out = response.getWriter();
		
		// getting data from jsp page and storing it in local variable
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String pincode = request.getParameter("pincode");
		String phone = request.getParameter("phone");
		String[] interests =  request.getParameterValues("interests");		       
		String dob = request.getParameter("dob");
		
		// creating an empty ArrayList	
		ArrayList<String> al = new ArrayList<String>();
		
		// if customer id is not starts with C or more than 4 character
		if((!(id.startsWith("C"))) ||  id.length() >4)
		{
			al.add("Please start id with C and not exceed 4 Character! ");
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
		
		// if age is character or string
		if(!age.matches("[0-9]+"))
		{
			al.add("Please enter age in numbers not in letters! ");
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
		
		// if interests are not selected or not selected minimum 2
		try{
			if (interests.length < 2) {
				al.add("Please check minimum two area of interest! ");
			}
		}
		catch(Exception e){
			al.add("Please check minimum two area of interest! ");
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
				File file = new File("D:\\Oxygen Workpace\\Customer\\WebContent\\customer.txt");
				
				// if file  created already then append data in that file
				FileWriter fwrite = new FileWriter(file,true);
				
				// Write a data in a file
				PrintWriter pw = new PrintWriter(fwrite);
				pw.print(id+", "+name+", "+gender+", "+dob+", "+age+", "+address+", "+city+", "+country+", "+pincode);
				
				// if phone number is empty then store it as null
				if(phone.equals(""))
				{
					pw.print(", "+null);
				}
				else
				{
					pw.print(", "+phone);
				}
				
				// adding all area of interested  values to ArrayList and writing in a file
				for(String aoi : interests)
			     {
					al.add(aoi);
			     }
				pw.print(", "+al);
				pw.println();
				
				// to give the guarantee that total data including last character will be written to the file
				pw.flush();
				
				// to close writer object
				pw.close();
				System.out.println("Customer Details are stored Successfully!, Thank you!");
				
				//out.println("Customer Details Sorted successfully, Thank you!");
				
				// forwarding request to success.jsp page
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/success.jsp");
				rd.forward(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Opps!, Exception Ocuured data is not stored in a file");
			}
		}
		
		
		
	}

}
