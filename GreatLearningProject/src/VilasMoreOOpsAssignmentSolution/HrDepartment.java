package VilasMoreOOpsAssignmentSolution;

public class HrDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("Hr Department");
	}
	public void getTodaysWork() {
		System.out.println("Fill today's worksheet and mark your attendance");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
		}
	public void doActivity() {
		System.out.println("team Lunch");
	}
}
	class main{
		public main(String []args) {
			HrDepartment obj = new HrDepartment();
		    obj.departmentName();
		    obj.getTodaysWork();
		    obj.getWorkDeadline();
		    obj.doActivity();
		}
}