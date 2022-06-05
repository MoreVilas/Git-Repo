package coreJava;

class ClassB{
	 public int x;

	    private int y;

	    void cal(int a, int b)

	    {

	        x =  a + 1;

	        y =  b;

	    }        

	    void print() {

	     System.out.println(" "+y);

	    }

	}    

	class ClassA{

	    public static void main(String args[])

	    {

	     ClassB obj = new ClassB();   

	        obj.cal(10, 20);

	        System.out.print(obj.x);   

	        obj.print();

	    }
}
