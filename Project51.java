package tucker5;

import java.util.Scanner;

public class Project51 {
	//#SPC ID 2429488 Mitchell Tucker
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int count = 0, number = 200, sum = 0; //holds integers
			while (count < 16) { // loops until count is 15
				number++; //increases number until it starts the nested if.
				if (number % 13 != 0 ^ number % 17 != 0) {
					if (number % 13 == 0 ^ number % 17 == 0) {
						if (count % 4 == 0) {
							System.out.println();
						}
						else {
							System.out.print(" "); //spaces in between integers/columns
						}
						System.out.printf("%9d", number); //formats 9 characters wide and prints number
					}
				count++; //increases count 
				sum = sum + number;//declares the new sum of the multiples.
				}
		
			}

			System.out.printf("%nSum = %d%n", sum); //prints out sum of 16 multiples
	}
	
}
