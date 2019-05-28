package com.ibm.takehome.ui;

import java.util.Scanner;

import com.ibm.takehome.service.IProductService;
import com.ibm.takehome.service.ProductService;

public class Client { 
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in); // for taking user input
		
		IProductService service = new ProductService(); //creating object for the Product Service Class
		
			char ch;
			do{	
				//Menu for the client
				System.out.println("YourStore.com ");
				System.out.println("**************");
				System.out.println("1. Generate Bill ");
				System.out.println("2. Exit ");
			
				
				System.out.println("Enter your choice : ");
				
				int choice = scan.nextInt();
				switch(choice) {
					case 1 : service.generateBill(); // calling the generate bill method of ProductService							 
							 break;
					case 2 : System.out.println("Exiting. . .");
							 System.exit(0);
					default :System.out.println("Please enter a valid option.");
				}
				
				System.out.println("Need Further Billing ?");
				ch = scan.next().charAt(0);
				}while(ch == 'y');
	}
}
	
			

