
public class VehiclePoly {
void run() {
	System.out.println("Vehicle is running");
}
public class Bike4 extends VehiclePoly{
	void run() {System.out.println("Bike is running safely");
}
}	
public static void main(String args[]) {
	Bike4 obj = (VehiclePoly.Bike4) new VehiclePoly();
	obj.run();
  }
}