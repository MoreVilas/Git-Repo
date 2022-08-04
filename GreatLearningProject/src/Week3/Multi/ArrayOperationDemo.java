package Week3.Multi;

public class ArrayOperationDemo {
	int []arr;
	int size;
	int capacity;
	ArrayOperationDemo(int capacity){
		this.capacity=capacity;
		arr= new int[capacity];
		size=0;
	}
	void insertInEnd(int element) {
		arr[size++]=element;
	}
	void insertAtIndex(int element, int index) {
		if(size==capacity)
			return;
		for(int i=index;i<size;i++)
			arr[i+1]=arr[i];
		arr[index]=element;
		size++;
	}
	int deleteInEnd() {
		int deletedElement = arr[size-1];
		arr[size-1]=0;
		size--;
		return deletedElement;
	}
	int deleteAtIndex(int index) {
		if(index>=size)
			return-1;
		int deletedElement = arr[index];
		for(int i=index+1;i<size;i++)
			arr[i-1]=arr[i];
	    size--;
	    return deletedElement;
	}
	boolean search(int element) {
		for(int i=0;i<size;i++)
			if(arr[i]==element)
				return true;
		return false;
	}
	void sort() {
		for(int i=0;i<size-1-i;i++)
			if(arr[i]>arr[i+1]) {
				int tmp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=tmp;
			}
	}
	void traversal() {
	   System.out.println("\nArray: ");
		for(int i=0;i<size;i++)
		System.out.println(arr[i]+" ");
		System.out.println("\n");
	}
	
public static void main(String[]args) {
	ArrayOperationDemo ob=new ArrayOperationDemo(10);
	ob.insertInEnd(20);
	ob.insertInEnd(13);
	ob.insertAtIndex(15,1);
	ob.traversal();
	System.out.println("Deleted Element: "+ob.deleteAtIndex(1));
	ob.traversal();
	System.out.println("Is 20 Present? "+ob.search(20));
	System.out.println("Is 15 Present? "+ob.search(15));
	ob.sort();
	ob.traversal();
}
}
