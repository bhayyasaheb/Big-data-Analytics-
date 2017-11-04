package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCustomerAge {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\Customer\\WebContent\\customer.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			
			int count1 = 0;
			int count2 = 0;
			
			while(line != null)
			{
				
				String a  = line;
				
				String[] s1 = a.split(", ");
				
				int age = Integer.parseInt(s1[4]);
				
				if(age > 18)
				{
					count1++;
				}
				else
				{
					count2++;
				}
				line = br.readLine();
			}
			
			System.out.println("The total customer above 18 years = "+count1);
			System.out.println("The total customer below 18 years  = "+count2);
			
			br.close();
			
		} catch (Exception e) {
			System.out.println("File not found Exception");
		}
	}
}
