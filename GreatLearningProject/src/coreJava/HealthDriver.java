package coreJava;
class Health{
	protected int age=28;
	protected float height=5.4f;
	protected float weight=70.5f;
}
public class HealthDriver {

	public static void main(String[] args) {
		Simplev2 simplev2=new Simplev2();
		System.out.println("Age is" + simplev2.age +"years");
		System.out.println("height is" +simplev2.height+"cm");
		System.out.println("weight is" +simplev2.weight+"kg");
	}

}
