package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCategoryTransaction {

	public static void main(String[] args) {
		
		try {
			
			FileReader  fr = new FileReader("D:\\Oxygen Workpace\\Big-data-Analytics-\\CustomerTransactionDetails\\WebContent\\Transaction.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			
			while(line != null)
			{
				if(line.contains("Appeareals"))
				{
					count1++;
				}
				if(line.contains("Home Appliances"))
				{
					count2++;
				}
				if(line.contains("Sports"))
				{
					count3++;
				}
				if(line.contains("Kitchen Appliances"))
				{
					count4++;
				}
				
				line = br.readLine();
			}
			System.out.println("Product Category Appeareals wise total Transaction is  : "+count1);
			System.out.println("Product Category Home Appliances wise total Transaction is  : "+count2);
			System.out.println("Product Category Sports wise total Transaction is  : "+count3);
			System.out.println("Product Category Kitchen Appliances wise total Transaction is  : "+count4);
			br.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
