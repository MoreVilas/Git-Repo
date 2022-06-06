public class StudentEncap {
private int rollno;
private String name;
private float free;

StudentEncap(int rollno, String name, float free){
	this.rollno=rollno;
	this.name=name;
	this.free=free;
	
}
void display() {
	System.out.println(rollno + " " +name+" "+free);
}
public class TestThis{
	public static void main(String args[]) {
		StudentEncap s1 = new StudentEncap(18,"Vilas",5000f);
		StudentEncap s2 = new StudentEncap(6,"Jigar",4000f);
		s1.display();
		s2.display();
	}
}
}
