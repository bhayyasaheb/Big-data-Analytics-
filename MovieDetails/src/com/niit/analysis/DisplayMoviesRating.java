package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayMoviesRating {

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
				int rating = Integer.parseInt(str[3]);
				
				if(rating == 4)
				{
					count++;
				}
				line = br.readLine();
			}
			
			System.out.println("The total movies having rating 4 is : "+count);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
