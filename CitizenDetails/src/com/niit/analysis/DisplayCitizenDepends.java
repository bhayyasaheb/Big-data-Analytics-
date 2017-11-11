package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCitizenDepends {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\CitizenDetails\\WebContent\\CitizenDetails.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			int count = 0;
			
			while(line != null)
			{
				String a =  line;
				String[] str =  a.split(", ");
				int depends = Integer.parseInt(str[13]);
				
				if(depends > 4)
				{
					count++;
				}
				line = br.readLine();
			}
			System.out.println("The total citizen whose depends are more than 4 are : "+count);
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
