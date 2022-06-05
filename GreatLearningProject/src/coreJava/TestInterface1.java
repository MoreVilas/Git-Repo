package coreJava;
interface Printable1{
	void print();
}
interface Showable1{
	void print();
}
public class TestInterface1 implements Printable1 , Showable1{
public void print() {System.out.println("Hello interface");} 
public static void main(String args[]) {
	TestInterface1 obj = new TestInterface1();
	obj.print();
}
}
