package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayMoviesDuration {

	public static void main(String[] args) {

		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\Big-data-Analytics-\\MovieDetails\\WebContent\\MovieDetails.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count = 0;
			
			while(line != null)
			{
				String a = line;
				String[] str = a.split(", ");
				double time = Double.parseDouble(str[4]);
				
				double duration = (time / (60*60)) ;
				
				if(duration == 2.5)
				{
					count++;
				}
				line = br.readLine();
			}
			System.out.println("Total number of movies having duration 2.5 hrs :  "+count);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
