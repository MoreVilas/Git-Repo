package VilasMoreOOpsAssignmentSolution;

public class AdminDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("Admin Department");
	}
	public void getTodaysWork() {
		System.out.println("Complete your documents Submission");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
		}
	class main{
		public main(String []args) {
			AdminDepartment obj = new AdminDepartment();
		    obj.departmentName();
		    obj.getTodaysWork();
		    obj.getWorkDeadline();
		
			}
	}
}

