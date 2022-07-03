package VilasMoreOOpsAssignmentSolution;

public class Main 
{
	public static void main(String[] args) {
		SuperDepartment sd=new AdminDepartment();
		SuperDepartment sd1=new HrDepartment();
		SuperDepartment sd2=new TechDepartment();
		
		sd.display();
		System.out.println();
		sd1.display();
		System.out.println();
		sd2.display();
	}

}