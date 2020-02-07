package tucker5;

import java.util.Scanner;

public class Project52 {
	//Mitchell Tucker SPC ID# 2429488
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int userBinary = 0;//initializes userBinary
		int count = 0; //initializes count
		int num = 0; //initializes num
		
		System.out.println("Please enter a binary number! (8 bits or less): ");
		userBinary = input.nextInt(); //userBinary now is what the user enters
		
		for (; userBinary != 0; count++) { 
			// 
			num =  (int) (num + (userBinary % 10) * Math.pow(2, count));
			userBinary = userBinary / 10; /* I could do num += but I'm used to num = and so 
			I cast the rest of the equation as an int and then it multiplies the number ^2 and adds 
			it with original entry.*/
		}
		System.out.println("Binary converted to 10 base decimal is: " + num);
		
	}

}
