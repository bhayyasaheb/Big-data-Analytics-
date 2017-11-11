package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayTotalGraduateCitizen {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\CitizenDetails\\WebContent\\CitizenDetails.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			int count = 0;
			
			while(line != null)
			{
				String a =  line;
				String[] str = a.split(",");
				
				if(str.length >= 17)
				{
					String s1 = str[16];
					if(s1.contains("Graduation"))
					{
						count++;
					}
				}
				line = br.readLine();
			}
			
			System.out.println("The total Graduate citizen is : "+count);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
