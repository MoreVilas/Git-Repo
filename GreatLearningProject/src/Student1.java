//Initialization through method
class Student1{
	int rollno;
	String name;
   void insertRecord(int r, String n) {
   rollno=r;
   name=n;
   }
   void displayInformation() {
	   System.out.println(rollno + name);
   }
public static void main(String[] args) {
	Student1 students1 = new Student1();
	Student1 students2 = new Student1();
	System.out.println("Sutdent1");
}