package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCustomerCountryWise {

	public static void main(String[] args) {
	
		try {
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\Customer\\WebContent\\customer.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int india = 0;
			int china =0;
			int usa = 0;
			int uk = 0;
			int aus = 0;
			
			String line = br.readLine();
			while(line != null)
			{
				if(line.contains("India"))
				{
					india++;
				}
				if(line.contains("China"))
				{
					china++;
				}
				if(line.contains("USA"))
				{
					usa++;
				}
				if(line.contains("UK"))
				{
					uk++;
				}
				if(line.contains("Australia"))
				{
					aus++;
				}
				line = br.readLine();
			}
			
			System.out.println("The total customer in India = "+india);
			System.out.println("The total customer in China = "+china);
			System.out.println("The total customer in USA = "+usa);
			System.out.println("The total customer in UK = "+uk);
			System.out.println("The total customer in Australia = "+aus);
			
			br.close();
			
		} catch (Exception e) {
			System.out.println("File not found Exception");
		}
	}

}
