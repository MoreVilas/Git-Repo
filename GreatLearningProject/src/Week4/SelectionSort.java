package Week4;

public class SelectionSort {
	public static void performSelectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for(int j = i; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j; //searching for lowest index
				}
			}
			//swap elements
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}
public static void main(String args[]) {
	int arr[] = {100, 10,30,40,24,50,0};
	System.out.println("Array Befor Selection Sort");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + " ");
		}
	System.out.println();
	
	//sorting array elements using selection sort
	performSelectionSort(arr);
	System.out.println("Array After Selection Sort");
	for (int i = 0; i <arr.length; i++) {
		System.out.println(arr[i] + " ");
	
	}
  }
}
	