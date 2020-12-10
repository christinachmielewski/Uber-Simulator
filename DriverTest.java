package carDriverTest;

import carDriver.Driver;
import carDriver.DriverImpl;
import carDriver.Position;
import carDriver.PositionImpl;
import carDriver.Vehicle;
import carDriver.VehicleImpl;

public class DriverTest {
	
	public static void main(String [] args) {
	
	// Create a few objects.
	
		Position a = new PositionImpl(3,5);
	
		Vehicle v = new VehicleImpl("honda","civic","5005",a);
	
		Driver b = new DriverImpl("john", "smith", 5, v);
	

		if (b.getFirstName() != "john") {
			throw new RuntimeException("Expected First Name: John");
		}
		if (b.getLastName() != "smith") {
			throw new RuntimeException("Expected last name: smith");
		}
		if (!b.getFullName() .equals ("john smith") ){
			throw new RuntimeException("expected full name: john smith");
		}
		if (b.getID() != 5) {
			throw new RuntimeException("expected id:5");
		}
		if(b.getVehicle() != v) {
			throw new RuntimeException("expected vehicle");
		}
		
		System.out.println("test passed");
	}// end main
	}
	
