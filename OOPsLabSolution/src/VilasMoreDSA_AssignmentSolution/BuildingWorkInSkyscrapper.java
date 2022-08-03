package VilasMoreDSA_AssignmentSolution;

import java.util.Scanner;

public class BuildingWorkInSkyscrapper {
	
	public static void main(String args[]) {
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter the total number floors in the building:");
		int n=sc.nextInt();
		
		int queue[]= new int[n+1];
		for(int i=1;i<n+1;i++) {
			System.out.println("Enter the floor size given on day:"+i);
			int m=sc.nextInt();
			queue[m]=i;
		}
		int j=n;
		boolean flag;
		System.out.println("The order of construction is as follows");
		for(int i=1;i<=n;i++) {
			flag=false;
			System.out.println("Day:"+1);
			while(j>=1 &&queue[j]<=i) {
				flag=true;
				System.out.println(j+" ");
				j--;
			}
			if(flag==true) {
				System.out.println();
			}
		}
		
	}

}
}
