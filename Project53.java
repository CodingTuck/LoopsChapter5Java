package tucker5;

import java.util.Scanner;

public class Project53 {
	//Mitchell Tucker SPC ID# 2429488
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declarations for the formats
		double sqRoot, cuRoot = 0;
		String number = "NUMBER";
		String sRoot = "SQ.ROOT";
		String cRoot = "CU.ROOT";
		String sDash = "-------";
		String sixDash = "------";
		
		System.out.println("Square roots and cube roots"); //title
		System.out.println();
		System.out.printf("%10s%10s%10s \n%10s%10s%10s", number, sRoot, cRoot, sixDash, 
				sDash, sDash); //formats 10 characters between each string
		
		//5-100 in increments of 5 getting the sq root and cu root and displaying them line by line
		for (int num = 5; num <= 100; num += 5) {
			sqRoot = Math.sqrt(num);//
			cuRoot = Math.cbrt(num);
			System.out.printf("\n%10d%10.3f%10.3f", num, sqRoot, cuRoot); //format and display
		}
	}

}
