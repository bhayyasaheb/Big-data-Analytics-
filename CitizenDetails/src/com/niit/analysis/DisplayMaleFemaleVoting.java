package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayMaleFemaleVoting {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\Oxygen Workpace\\CitizenDetails\\WebContent\\CitizenDetails.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		int count1=0;
		int count2=0;
		
		while(line != null)
		{
			String a = line;
			String[] str = a.split(", ");
			
			int age = Integer.parseInt(str[4]);
			String gender = str[2];
			if(age >= 18)
			{
				if(gender.equals("Male"))
				{
					count1++;
				}
				else
				{
					count2++;
				}
			}
			line = br.readLine();
		}
		
		System.out.println("Total Male Citizen eligible for voting is : "+count1);
		System.out.println("Total Female Citizen eligible for voting is : "+count2);
		br.close();
	}
}
