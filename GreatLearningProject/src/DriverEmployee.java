
public class DriverEmployee {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		employee1.empId = 123;
		employee1.empName = ("Vilas");
		employee1.empAddress = ("India");
		
		employee1.displayEmpData();
        
		Employee employee2 = new Employee();
		
		employee2.empId = 123;
		employee2.empName = "Vilas";
		employee2.empAddress = "India";
		
		employee2.displayEmpData();

	}

}
