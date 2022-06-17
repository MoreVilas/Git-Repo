package VilasMoreOOpsAssignmentSolution;

public class BubbleSort {
	static void performBubbleSort(int[]arr) {
		int size = arr.length;
		int temp = 0;
		for(int i=0; i< size; i++) {
			for(int j=1; j< (size-i); j++) {
				if(arr[j-1] > arr[j]) {
					//swap elements
					temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j] = temp;
					
				}
			}
		}
	}
public static void main(String[] args) {
	int arr[] = {100,2,4,1,57,24,9};
	
	System.out.println("Array Before Bubble Sort");
	for(int i=0; i< arr.length; i++) {
		System.out.println(arr[i] + " ");
	}
	System.out.println();
	
	//sorting array elements using bubble sort
	performBubbleSort(arr);
	
	System.out.println("Array After Bubble Sort");
	for(int i=0; i <arr.length; i++) {
		System.out.println(arr[i] + " ");
	}
}
}