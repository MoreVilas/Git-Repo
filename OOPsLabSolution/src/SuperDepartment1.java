public class SuperDepartment1 {
		   
		public SuperDepartment1() {
			String departmentName;
			String getTodaysWork;
			String getWorkDeadline;
			String isTodayAHoliday;
		}
		public void  departmentName(){
			System.out.println("Super Department");
			}
		public void getTodaysWork() {
			System.out.println("No Work as of now");
		}
		public void getWorkDeadline() {
			System.out.println("Nil");
			}
		public void isTodayAHoliday() {
			System.out.println("Today is not a holiday");
			}
		class main {
			public static void main(String [] args) {
				SuperDepartment1 obj = new SuperDepartment1();
				obj.departmentName();
			    obj.getTodaysWork();
			    obj.getWorkDeadline();
			    obj.isTodayAHoliday();
	            
				}
		}
		public void SuperDepartment() {
			// TODO Auto-generated method stub
			
		}
	}
