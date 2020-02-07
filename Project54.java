package tucker5;

import java.util.Scanner;

public class Project54 {
	//Mitchell Tucker SPC ID# 2429488
	//cashier terminal where user enters the price of item and amount and continues until 
	//finished and then outputs subtotal
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double unitPrice, quantity, total = 0; //declare variables
		
		System.out.println("Enter item price or zero to quit: ");
		unitPrice = input.nextDouble(); //store variable unitPrice
		
		while (unitPrice != 0) {
			System.out.println("Enter quantity of this item: ");
			quantity = input.nextDouble();//store variable quantity
			
			System.out.printf("Item total is $%.2f\n", unitPrice*quantity);
			
			total = total + (unitPrice*quantity); //store variable total
			
			System.out.println("Enter item price or zero to quit: "); //continuation of loop if user != 0
			unitPrice = input.nextDouble();
		}
	System.out.printf("Total amount for all your items are: $%.2f\n", total); //displays grand total
	}

}
