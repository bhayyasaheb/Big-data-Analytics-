package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplaySeniorCitizen {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\CitizenDetails\\WebContent\\CitizenDetails.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			int count = 0;
			
			while(line != null)
			{
				String a = line;
				String[] str = a.split(", ");
				int age = Integer.parseInt(str[4]);
				if(age > 60)
				{
					count++;
				}
				line = br.readLine();
			
			}
			
			System.out.println("The total senior citizen and eligible for pension is : "+count);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
