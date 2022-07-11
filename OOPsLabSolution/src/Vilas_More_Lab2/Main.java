package Vilas_More_Lab2;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Transaction transaction = new Transaction();
		int transactionArr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		transactionArr = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the transaction value"+(i+1));
			transactionArr[i]=sc.nextInt();			
		}
		System.out.println("Enter the number of targets to be achieved");
		int target = sc.nextInt();
		
		for(int j=0;j<target;j++) {
			System.out.println("Enter the transaction value");
			int t1=sc.nextInt();
			int transactionNumber=transaction.isTargetAchieved(transactionArr,t1);
			if(transactionNumber==-1) {
				System.out.println("Target not Achieved");
				}
			else {
				System.out.println("Target achievded at " +transactionNumber+ "transaction");
			}
		}
		sc.close();
	}
}
