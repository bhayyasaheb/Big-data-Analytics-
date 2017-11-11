package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCitizenSalary {

	public static void main(String[] args) {
	
		try {
			
			FileReader fr = new FileReader("D:\\\\Oxygen Workpace\\\\CitizenDetails\\\\WebContent\\\\CitizenDetails.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count = 0;
			
			while(line != null)
			{
				String a = line;
				String[] str =  a.split(", ");
				int salary = Integer.parseInt(str[12]);
				
				if(salary > 10000)
				{
					count++;
				}
				line = br.readLine();
			}
			System.out.println("The total citizen whose salary above 10000 is : "+count);
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
