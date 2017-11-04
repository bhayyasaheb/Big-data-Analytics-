package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCustomerWithoutPhone {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\Customer\\WebContent\\customer.txt"); 
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			int count = 0;
			while(line != null)
			{
				String a = line;
				
				String[] s = a.split(", ");
				
				String s1 = s[9];
				
				if(s1.equals("null"))
					count++;
				line = br.readLine();
			}
			
			System.out.println("The total customer who don't have phone no = "+ count);
			
			br.close();
			
		} catch (Exception e) {
			System.out.println("File not found Exception : "+e.getMessage());
		}

	}

}
