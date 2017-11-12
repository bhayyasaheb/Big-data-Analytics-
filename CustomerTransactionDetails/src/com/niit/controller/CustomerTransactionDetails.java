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

@WebServlet("/CustomerTransactionDetails")
public class CustomerTransactionDetails extends HttpServlet {
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
		String cId = request.getParameter("cId");
		String cName = request.getParameter("cName");
		String cAge = request.getParameter("cAge");
		String cProfession = request.getParameter("cProfession");
		String cSalary = request.getParameter("cSalary");
		String tId = request.getParameter("tId");
		String tDate = request.getParameter("tDate");
		String tAmount = request.getParameter("tAmount");
		String pCategory = request.getParameter("pCategory");
		String pName = request.getParameter("pName");
		String tMode = request.getParameter("tMode");
		
		ArrayList<String> al = new ArrayList<String>();
		
		// customer id is null or blank
		if(cId.equals("") || cId == null)
		{
			al.add("Please enter the Customer Id it should not be null or blank");
		}
				
		// customer name is null or blank
		if(cName.equals("") || cName == null)
		{
			al.add("Please enter the Customer Name it should not be null or blank");
		}
		// customer age is null or blank
		if(cAge.equals("") || cAge == null)
		{
			al.add("Please enter the Customer Age it should not be null or blank");
		}
		
		
		// customer Profession is null or blank
		if(cProfession.equals("") || cProfession == null)
		{
			al.add("Please enter the Customer Profession it should not be null or blank");
		}
		
		// annual salary is null or blank
		if(cSalary.equals("") || cSalary == null)
		{
			al.add("Please enter the Annual Salary it should not be null or blank");
		}
		
		// Transaction id is null or blank
		if(tId.equals("") || tId == null)
		{
			al.add("Please enter the Transaction Id it should not be null or blank");
		}
		
		// Transaction Date is null or blank
		if(tDate.equals("") || tDate == null)
		{
			al.add("Please enter the Transaction Date it should not be null or blank");
		}
		
		// Transaction amount is null or blank
		if(tAmount.equals("") || tAmount == null)
		{
			al.add("Please enter the Transaction Amount it should not be null or blank");
		}

		// Product Category is null or blank
		if(pCategory.equals("") || pCategory == null)
		{
			al.add("Please select the Product Category it should not be null or blank");
		}
		
		// Product name is null or blank
		if(pName.equals("") || pName == null)
		{
			al.add("Please enter the Product Name it should not be null or blank");
		}
		
		// Transaction mode is null or blank
		if(tMode.equals("") || tMode == null)
		{
			al.add("Please select the Transaction Mode it should not be null or blank");
		}

		if(al.size() != 0)
		{
			out.println(al);
			System.out.println("Opps! \n"+al);
		}
		else
		{
			try {
				
			/*
			 * Storing data in Customer.txt
			*/
			// File to create a new file Custmomer.txt
			File file1 = new File("D:\\Oxygen Workpace\\Big-data-Analytics-\\CustomerTransactionDetails\\WebContent\\Customer.txt");
			
			// if file  created already then append data in that file
			FileWriter fw1 = new FileWriter(file1, true);
			
			// Write a data in a file Customer.txt
			PrintWriter pw1 = new PrintWriter(fw1);
			
			// Checking id is already exit in a file or not
			
			
			// File reader to read file for checking customer Id already exits or not
			FileReader  fr = new FileReader("D:\\Oxygen Workpace\\Big-data-Analytics-\\CustomerTransactionDetails\\WebContent\\Customer.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			boolean available = false;
			
			while(line != null)
			{
				
				String[] str1 = line.split(",");
				String id1 = str1[0];
				
				if(id1.equals(cId))
				{
					available = true;
					break;
				}
				line = br.readLine();
			}
			br.close();
			if(available == false)
			{
				pw1.print(cId);
				pw1.print(", "+cName);
				pw1.print(", "+cAge);
				pw1.print(", "+cProfession);
				pw1.print(", "+cSalary);
				pw1.println();
			}
			
			// to give the guarantee that total data including last character will be written to the file
			pw1.flush();
			
			// to close writer object
			pw1.close();
			
			System.out.println("Customer Details stored Successfully! Thank You");
			
			/*
			 * Storing data in Transaction.xtx
			*/
			
			// File to create a new file Custmomer.txt
			File file2 = new File("D:\\Oxygen Workpace\\Big-data-Analytics-\\CustomerTransactionDetails\\WebContent\\Transaction.txt");
			
			// if file  created already then append data in that file
			FileWriter fw2 = new FileWriter(file2, true);
			
			// Write a data in a file Customer.txt
			PrintWriter pw2 = new PrintWriter(fw2);
			
			pw2.print(tId);
			pw2.print(", "+tDate);
			pw2.print(", "+cId);
			pw2.print(", "+tAmount);
			pw2.print(", "+pCategory);
			pw2.print(", "+pName);
			pw2.print(", "+tMode);
			
			pw2.println();
			
			// to give the guarantee that total data including last character will be written to the file
			pw2.flush();
			
			// to close writer object
			pw2.close();
			
			System.out.println("Transaction Details stored Successfully! Thank You");
			
			
			//out.println("Customer Transactions Details stored Successfully!, Thank You");
			
			// forwarding request to success.jsp page
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/success.jsp");
			rd.forward(request, response);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
