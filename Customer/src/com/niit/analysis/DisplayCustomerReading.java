package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCustomerReading {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\Customer\\WebContent\\customer.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count=0;
			
			while(line != null)
			{
				if(line.contains("Reading"))
				{
					count++;
				}
				line = br.readLine();
			}
			System.out.println("The total customer who like Reading = "+count);
			br.close();
			
		} catch (Exception e) {
			System.out.println("File not found Exception");
		}

	}

}
