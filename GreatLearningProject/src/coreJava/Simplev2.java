package coreJava;

class B{
	B(){}
	public int data=1974;
	public void msg() {
		System.out.println(data);
		System.out.println("Hello java");
	}
}
public class Simplev2 {
	public static void main (String args[]) {
		B obj=new B();
		System.out.println(obj.data);
		obj.msg();
	}

	public String age;
	public String height;
	public String weight;

}
