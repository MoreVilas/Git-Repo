package Week3;

public class InheritanceC extends InheritanceB{
      public float base,height,result;
      public void triangleArea(int b, int h) {
    	  base = b;
    	  height = h;
    	  result = 0.5f*base*height;
    	  
    	  System.out.println("The area of the triangle is:"+result+"cm square");
      }
    	  public static void Main(String[]args) {
    		  
    		  InheritanceC inheritancec = new InheritanceC();
    		  
    		  inheritancec.circleArea(22.5f);
    		  inheritancec.rectangleArea(5, 6);
    		  inheritancec.triangleArea(3, 4);
    	
      }
}
