package carDriverTest;

import carDriver.Position;
import carDriver.PositionImpl;
import carDriver.Vehicle;
import carDriver.VehicleImpl;

public class VehicleTest {
	
	public static void main(String[]args) {
		
		Position pstn = new PositionImpl(3,5);
		Position pnew = new PositionImpl(4,7);
		Vehicle v = new VehicleImpl("honda", "civic", "50055", pstn);
		Vehicle updatedPos = new VehicleImpl("honda", "civic", "50055", pstn);

		
		if(!v.getMake().equals("honda")) {
			throw new RuntimeException("Expected make of honda");
		}
		if(!v.getModel().equals("civic")) {
			throw new RuntimeException("Expected model of civic");
		}
		if(!v.getPlate().equals("50055")) {
			throw new RuntimeException("Expected plate number: 50055");
		}
		if(v.getMileage()!= 8) {
			throw new RuntimeException("Expected mileage of 8");
		}
		
		updatedPos.moveToPosition(pnew);
		
		if(updatedPos.getPosition().getX() != 4){
			throw new RuntimeException("Expected position x: 4");
		}
		if(updatedPos.getPosition().getY() != 7){
			throw new RuntimeException("Expected position y: 7");
		}
		

		
		System.out.println("Test passed");
		
		
	} // end main
	

} //end class
