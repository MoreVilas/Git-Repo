public class Bike5{
	int speedlimit=160;
	class Honda5 extends Bike5{
		int speedlimit=80;
		}
public static void main(String args[]) {
	Bike5 obj = new Bike5();
	System.out.println(obj);
	System.out.println(obj.speedlimit);
}

}
