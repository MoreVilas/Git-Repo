package Week3;

public class InheritanceB extends InheritanceA {
	public float length,breadth,result;
	public void rectangleArea(int I, int b) {
		
		length = I;
		breadth = b;
		result = length*breadth;
		
		System.out.println("The area of rectangle is:"+result+"cm square");
	}
}
