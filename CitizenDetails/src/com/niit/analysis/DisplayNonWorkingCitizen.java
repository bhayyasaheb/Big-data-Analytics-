package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayNonWorkingCitizen {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("D:\\\\Oxygen Workpace\\\\CitizenDetails\\\\WebContent\\\\CitizenDetails.txt");
		
		BufferedReader br  = new BufferedReader(fr);
		
		String line = br.readLine();
		
		int count1 = 0;
		
		while( line != null)
		{
			String a =  line;
			String[] str = line.split(", ");
			
			String workingStatus = str[10];
			
			if(workingStatus.equals("No"))
			{
				count1++;
			}
			line = br.readLine();
		}
		System.out.println("The total Citizen working is : "+count1);
	}

}
