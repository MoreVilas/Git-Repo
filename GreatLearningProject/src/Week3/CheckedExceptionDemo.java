package Week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class CheckedExceptionDemo {
 private static final BufferedReader FileInput = null;

public static void main(String[]args) throws IOException {
	 FileReader file = new FileReader("f:\\java-tutorials\\soure.txt");
	 BufferedReader fileInput = new BufferedReader (file);
	 
	 
	 for (int counter = 0; counter < 3; counter++ ) {
		 System.out.println(fileInput.readLine());
		 }
	 FileInput.close();
	 
 }
}
