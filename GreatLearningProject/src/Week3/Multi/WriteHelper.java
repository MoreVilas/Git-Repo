package Week3.Multi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WriteHelper {
   public void readFile() throws IOException {
	   FileReader file = null;
	   BufferedReader fileInput = null;
	   
	   try {
		   file = new FileReader("F:\\java-tutorials\\source.txt");
		   fileInput = new BufferedReader(file);
		   
		   for (int counter = 0; counter < 3; counter++) {
			   System.out.println(fileInput.readLine());
		   }
	   } catch (FileNotFoundException e) {
		   System.out.println("Caught FileNotFoundException:" + e.getMessage());
	   }catch (IOException	e) {
		   System.out.println("Caught FileNotFoundException:" + e.getMessage());
	   } finally {
		   if (fileInput != null) {
			   System.out.println("closing the buffered reader");
			   fileInput.close();
		   }else {
			   System.out.println("buffered reader is null no need to print");
		   }
	   }
   }
}
