package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayAllMovies {

	public static void main(String[] args) {

		try {
			
			FileReader fr = new FileReader("D:\\Oxygen Workpace\\Big-data-Analytics-\\MovieDetails\\WebContent\\MovieDetails.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			int count = 0;
			
			while(line != null)
			{
				count++;
				line = br.readLine();
			}
			System.out.println("Total number of Movies data Available is : "+count);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
