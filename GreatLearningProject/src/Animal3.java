public class Animal3{
	void eat() {
		System.out.println("Animal is eating...");
	}
	class Dog3 extends Animal3{
		void eat() {
			System.out.println("dog is eating....");
		}
	}
public class Babydog3 extends Dog3{
public static void main(String args[]) {
	Animal3 a =new Animal3();
	System.out.println(a);
}
}
}

