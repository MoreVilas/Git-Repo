package Week3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayExample {
	private static List<Integer> linkedHashSet;

	public static void main(String[]args)
		throws CloneNotSupportedException{
		//Array with duplicate elements
		Integer[]numbers = new Integer[] {1,2,3,4,5,1,3,5,6,7,3,4,5,3,2,2,4,5,3,2,1,3,};
		
		//This array has duplicate elements
		System.out.println(Arrays.toString(numbers));
		//Create set from array elements
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(numbers));
		
		//Get back the array without duplicates
		Integer[]numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
		//Verify the array content
		System.out.println(Arrays.toString(numbersWithoutDuplicates));

}
}