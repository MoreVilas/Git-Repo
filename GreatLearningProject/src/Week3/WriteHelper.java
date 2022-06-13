package Week3;
import java.nio.channels.AlreadyBoundException;
import java.util.ArrayList;
import java.util.List;

public class WriteHelper {
   public void writeList() {
	   try {
		   List<Integer> list = new ArrayList<>(10);
		   list.add(10);
		   
		   System.out.println("Entering" + "try statement");
		   Integer a = list.get(0);
		   System.out.println("accessing the first element:" + a);
	   }
	   catch (AlreadyBoundException e) {
		   System.out.println("Caught IndexOutOfBoundsException:" + e.getMessage());
	   }	   finally {
			   System.out.println("this will always be excuted");
			   
		   }
	   }

public void readFile() {
	// TODO Auto-generated method stub
	
}
	   }
