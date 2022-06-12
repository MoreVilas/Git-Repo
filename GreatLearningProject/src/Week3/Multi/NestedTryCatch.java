package Week3.Multi;

import java.awt.AWTException;
import java.rmi.AlreadyBoundException;

public class NestedTryCatch {
  public static void main (String args[]) {
	  
	  try { //block1
		  try { //block2
			  try { //blck3
				  int arr[] = { 1, 2, 3, 4};
				  System.out.println(arr[10]);
		  } catch (ClassCastException e4) {
			  System.out.println("NullPointException in block 3");
	             throw e4;
	             }
	  }    catch (StringIndexOutOfBoundsException e) {
		  System.out.println("StringIndexOutOfBoundsException Exception in block 2");
          throw e;
	  }
	  }  catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("ArrayIndexOutOfBound Exception in block 1");
          throw e;
    }
	  }}