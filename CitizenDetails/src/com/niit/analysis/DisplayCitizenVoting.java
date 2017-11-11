package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCitizenVoting {
	
	public static void main(String[] args) {
		
		try {
			
			FileReader fr =  new FileReader("D:\\Oxygen Workpace\\CitizenDetails\\WebContent\\CitizenDetails.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count=0;
			
			while(line != null)
			{
				String a = line;
				String[] s1 = a.split(", ");
				
				int age = Integer.parseInt(s1[4]);
				
				if(age >=  18)
				{
					count++;
				}
				line = br.readLine();
			}
			
			System.out.println("The total citizen eligible for voting is : "+count);
			br.close();
		} catch (Exception e) {
			System.out.println("File not found exception");
		}

	}

}
