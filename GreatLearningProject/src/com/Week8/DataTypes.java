package com.Week8;
import java.util.Scanner;

public class DataTypes {
	public static void main(String[]args) {
		int i = 4;
		double d = 4.0;
		String s ="HackerRank";
		
		Scanner scan = new Scanner(System.in);
		
		/* Declare second integer, double, and String variables. */
		int i2;
		double d2;
		String s2;
		
		/*Read and save an integer, double, and String to your variables. */
		
		i2 = scan.nextInt();
		d2 = scan.nextDouble();
		
		scan.nextLine();
		s2 = scan.nextLine();
		
		/* Print the sum of the both integer variables on a new line. */
		System.out.println(i + i2);
		
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + d2);
		
		/* Concatenate and print the String variables on new line;
		 * the "s" variable above should be printed first. */
		System.out.println(s.concat(s2));
		
		scan.close();
		 
	}

}
