package VilasMoreOOpsAssignmentSolution;

public class TechDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("Tech Department");
	}
	public void getTodaysWork() {
		System.out.println("Complete coding of module 1");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
		}
	public void getTechStackInformation() {
		System.out.println("core Java");
	}
		public void main(String []args) {
			HrDepartment obj = new HrDepartment();
		    obj.departmentName();
		    obj.getTodaysWork();
		    obj.getWorkDeadline();
		 }
}