package Week4;

public class LinearSearch {

	public static int linearSearch(int[] arr, int key, int size) {
        for (int i =0; i < size; i++) {
        	if (arr[i] == key) {
        		return i;
        	}
        }
        return -1;
	}
	public static void main(String a[]) {
		int array[] = {101, 20, 31, 5, 701, 90};
		int size = array.length;
		int keyElement = 701;
		int position = linearSearch(array, keyElement, size);
		if(position== -1) {
			System.out.println("Element is not present in the given array");
			}
		else {
			System.out.println("Element found at array index" +position);
		}
		
	}
}