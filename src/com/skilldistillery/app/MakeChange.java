package com.skilldistillery.app;

public class MakeChange {

	public static void main(String[] args) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.println("What is the item's price?");
		double itemPrice = keyboard.nextDouble();
		System.out.println("How much money was tendered from the customer?");
		double tenderedAmt = keyboard.nextDouble();
        double customerChange = (tenderedAmt - itemPrice)+.001;
		
		


		if (tenderedAmt > itemPrice) {
			System.out.println("Opening Register. Change will be:" + customerChange);
			
			printReceipt();
		}

		if (tenderedAmt == itemPrice) {
			System.out.println("Exact Payment Received, here is the Receipt.");
			printReceipt();
		}

		if (tenderedAmt < itemPrice) {
			System.out.println("Error Message: Insufficient Payment.");
			
			
		}
		
			int customerChangeInt = (int) (customerChange * 100);
		
			
		//System.out.println(customerChangeInt); 
	
		
			if(customerChangeInt>20 * 100)
			{
				int twentyCount = 0;
				twentyCount = customerChangeInt / 2000;
				System.out.println("Twenty Count: " + twentyCount);
				customerChangeInt = customerChangeInt - (2000 * twentyCount);	
			}
			
			if(customerChangeInt>10 * 100)
			{
				int tenCount = 0;
				tenCount = customerChangeInt / 1000;
				System.out.println("Ten Count: " + tenCount);
				customerChangeInt = customerChangeInt - (1000 * tenCount);	
			}
			if(customerChangeInt>5 * 100)
			{
				int fiveCount = 0;
				fiveCount = customerChangeInt / 500;
				System.out.println("Five Count: " + fiveCount);
				customerChangeInt = customerChangeInt - (500 * fiveCount);	
			}
			if(customerChangeInt>1 * 100)
			{
				int oneCount = 0;
				oneCount = customerChangeInt / 100;
				System.out.println("One Count: " + oneCount);
				customerChangeInt = customerChangeInt - (100 * oneCount);	
			}
			if(customerChangeInt>.25 * 100)
			{
				int quarterCount = 0;
				quarterCount = customerChangeInt / 25;
				System.out.println("Quarter Count: " + quarterCount);
				customerChangeInt = customerChangeInt - (25 * quarterCount);	
			}
			if(customerChangeInt>.10 * 100)
			{
				int dimeCount = 0;
				dimeCount = customerChangeInt / 10;
				System.out.println("Dime Count: " + dimeCount);
				customerChangeInt = customerChangeInt - (10 * dimeCount);
			}
			if(customerChangeInt >.05 * 100)
			{
				int nickelCount = 0;
				nickelCount = customerChangeInt / 5;
				System.out.println("Nickel Count: " + nickelCount);
				customerChangeInt = customerChangeInt - (5 * nickelCount);	
			}
			if(customerChangeInt> 1)
			{
				int pennyCount = 0;
				pennyCount = (int)(customerChangeInt / 1 );
				System.out.println("Penny Count: " + pennyCount);
				customerChangeInt = customerChangeInt - (1 * pennyCount);	
			}
			//return customerChangeInt/2;
	}
	
	

	public static String printReceipt() {
		String receiptTemplate = "//// Thank You! ////\n" + "//// SHOP WITH US AGAIN! ////\n" + "/////////////////";
		System.out.println(receiptTemplate);
		return receiptTemplate;
 

	}}
