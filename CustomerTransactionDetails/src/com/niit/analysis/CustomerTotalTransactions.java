package com.niit.analysis;

import java.io.BufferedReader;
import java.io.FileReader;

public class CustomerTotalTransactions {

	public static void main(String[] args) {
	
		try {
			
			FileReader  fr = new FileReader("D:\\Oxygen Workpace\\Big-data-Analytics-\\CustomerTransactionDetails\\WebContent\\Transaction.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
			int C1 = 0;
			int C2 = 0;
			int C3 = 0;
			int C4 = 0;
			int C5 = 0;
			int C6 = 0;
			int C7 = 0;
			
			while(line != null)
			{
				if(line.contains("C1"))
				{
					C1++;
				}
				if(line.contains("C2"))
				{
					C2++;
				}
				if(line.contains("C3"))
				{
					C3++;
				}
				if(line.contains("C4"))
				{
					C4++;
				}
				if(line.contains("C5"))
				{
					C5++;
				}
				if(line.contains("C6"))
				{
					C6++;
				}if(line.contains("C7"))
				{
					C7++;
				}
				line = br.readLine();
			}
			System.out.println("Customer wise Total Transcation of Bhayyasaheb Koke : "+C1);
			System.out.println("Customer wise Total Transcation of  Sayali Pise : "+C2);
			System.out.println("Customer wise Total Transcation of Sarika Borate : "+C3);
			System.out.println("Customer wise Total Transcation of Shahaji Borate : "+C4);
			System.out.println("Customer wise Total Transcation of Mohan Lohar : "+C5);
			System.out.println("Customer wise Total Transcation of Mahesh Zagade : "+C6);
			System.out.println("Customer wise Total Transcation of Mahesh Waghmare : "+C7);
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
