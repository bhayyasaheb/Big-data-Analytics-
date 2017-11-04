package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCustomerMaleFemale {

	public static void main(String[] args) {
		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\Customer\\WebContent\\customer.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int malecount=0;
			int femalecount = 0;
			
			String line = br.readLine();
			while(line != null)
			{
				if(line.contains("Female"))
				{
					femalecount++;	
				}
				if(line.contains("Male"))
				{
					malecount++;
				}
				line = br.readLine();
				
			}

			System.out.println("Total Male Customer: "+malecount);
			System.out.println("Total Female Customer: "+femalecount);
			br.close();
		} catch (Exception e) {
			System.out.println("File not found Exception");
		}
		
	}

}
