package Vilas_More_Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Denominations {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of denominations used");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the denomination values");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		MergeSortImplementation merge= new MergeSortImplementation();
		merge.sort(arr, 0, num-1);
		System.out.println("The denominations in decreasing order"+ Arrays.toString(arr));
		
		System.out.println("enter the amount to pay");
		int payment = sc.nextInt();
		
		NotesCount count = new NotesCount();
		count.countDenominations(arr, payment);
	}

}
