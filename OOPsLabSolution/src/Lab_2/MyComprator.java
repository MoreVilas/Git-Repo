package Lab_2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MyComprator {
	class Mycomprator implements Comparator{
		
		public int compare(Object obj1, Object obj2) {
			
			Integer i1=(Integer)obj1;
			
			Integer i2=(Integer)obj2;
			
			return i2.compareTo(i1);
			
		}
	}
	
	class SkyScrapper{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the total no of floors in the building");
			int n=sc.nextInt();
			
			int max=n;
			
			Queue<Integer> queue=new PriorityQueue<Integer>();
			
			int[] disks = new int[n];
			
			for(int i=0;i<n;i++)
			{
				System.out.println("enter floor size given by day:"+(i+1));
				disks[i]=sc.nextInt();
				
				queue.add(disks[i]);
				
				while(!queue.isEmpty()&&queue.peek()==max)
				{
					System.out.println(queue.poll()+ " ");
					
					max--;
				}
				System.out.println();
			}
		}
	}

}
