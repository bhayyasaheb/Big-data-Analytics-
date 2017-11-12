package com.niit.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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


@WebServlet("/MovieDetailsServlet")
public class MovieDetailsServlet extends HttpServlet {
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
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String releaseDate = request.getParameter("releaseDate");
		String rating = request.getParameter("rating");
		String duration = request.getParameter("duration");
		
		// creating an empty ArrayList	
				ArrayList<String> al = new ArrayList<String>();
		
		try {
			
			int rat = Integer.parseInt(rating);
			
			// if rating is less than 0 and greater that 10
			if(rat < 0 || rat > 10)
			{
				al.add("Please enter rating between  0 to 10");
			}
			
		}catch (Exception e) {
			al.add("Rating should not be null is should be between 0 to 10");
		}
		
		// if name is null or empty 
		if(name == null || name.equals(""))
		{
			al.add("Please movie name must not null or blank! ");
		}

		// if name is null or empty 
		if(duration == null || duration.equals(""))
		{
			al.add("Please enter duration in seconds! ");
		}
		
		// if release date have more than 8 digit
		try
		{
			if(releaseDate.length() > 8)
			{
				al.add("Please enter release date & sould not exceed 8 digit! ");
			}
		}
		catch(Exception e)
		{
			al.add("Please enter the movie release date! ");
		}
		
		// Checking id is already exit in a file or not
		
		try {
			// File reader to read file 
			FileReader  fr = new FileReader("D:\\Oxygen Workpace\\MovieDetails\\WebContent\\MovieDetails.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			while(line != null)
			{
				
				String[] str1 = line.split(",");
				String id1 = str1[0];
				
				if(id1.equals(id))
				{
					al.add("Movie Id is already exit please enter another movie id");
					//out.println("Movie Id is already exit please enter another movie id");
					break;
				}
				line = br.readLine();
				
			}
			br.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		if(al.size() != 0)
		{
			out.println(al);
			System.out.println("Opps! \n" + al);
		}
		else {
			
			try {
				
				// File to create a new file
				File file = new File("D:\\Oxygen Workpace\\MovieDetails\\WebContent\\MovieDetails.txt");
				
				// if file  created already then append data in that file
				FileWriter fwrite = new FileWriter(file,true);
				
				// Write a data in a file
				PrintWriter pw = new PrintWriter(fwrite);
				
				pw.print(id);
				pw.print(", " +name);
				pw.print(", "+releaseDate);
				pw.print(", "+rating);
				pw.print(", "+duration);
				
				pw.println();
				
				// to give the guarantee that total data including last character will be written to the file
				pw.flush();
				
				// to close writer object
				pw.close();
				System.out.println("Movie  Details are stored Successfully!, Thank you!");
				
				//out.println("Movie Details Sorted successfully, Thank you!");

				// forwarding request to success.jsp page
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/success.jsp");
				rd.forward(request, response);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
