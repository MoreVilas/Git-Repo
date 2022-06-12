package Week3.Multi;

import java.rmi.AlreadyBoundException;

public class MultipleCatchDemo {
  public static void main(String[]args) {
	  try {                   //try block
		  int arr[] = new int[10];  //Size of array
		  arr[0] = 20/0;            //divide by zero is illegal operation
		  //String a = null;
		  //a.charAt(0);
		  System.out.println("try block ends here");
		  }
	  catch (ArithmeticException ae) {       // first catch block
		  System.out.println("divide by zero not possible"+ ae.getMessage());
	  	  } catch (ArrayIndexOutOfBoundsException e) {  //Specific type of exception
	  		  System.out.println(
	  				  "cannot access an array element outside of array length");
	  		  } catch (Exception e) {                      
	  			  System.out.println("any other generic exception" + e.getMessage());
	  			  }
	        System.out.println("I am out of try-catch block");
  }
}
