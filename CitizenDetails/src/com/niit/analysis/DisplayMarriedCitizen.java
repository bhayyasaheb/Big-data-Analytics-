package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayMarriedCitizen {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr  = new FileReader("D:\\\\Oxygen Workpace\\\\CitizenDetails\\\\WebContent\\\\CitizenDetails.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count = 0;
			while(line != null)
			{
				String a= line;
				
				String[] str = a.split(", ");
				String marriedStatus= str[11];
				
				if(marriedStatus.equals("Yes"))
				{
					count++;
				}
				line = br.readLine();
			}
			System.out.println("The total citizen married is : "+count);
			br.close();
			
		} catch (Exception e) {
			System.out.println("File Not Found Exception");
		}
	}

}
