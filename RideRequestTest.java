package carDriverTest;

import carDriver.CompletedRide;
import carDriver.CompletedRideImpl;
import carDriver.Driver;
import carDriver.DriverImpl;
import carDriver.Position;
import carDriver.PositionImpl;
import carDriver.RideRequest;
import carDriver.RideRequestImpl;
import carDriver.Vehicle;
import carDriver.VehicleImpl;

public class RideRequestTest {

	public static void main(String[]args) {
		
		Position client_pos = new PositionImpl(3,4);
		Position dest_pos = new PositionImpl(1,0);
		Position driver_pos = new PositionImpl(1,2);
		Vehicle v = new VehicleImpl("Ford", "Focus", "ABC-123", driver_pos);
		Driver d = new DriverImpl("John", "Smith", 1234, v);

			RideRequest r = new RideRequestImpl(client_pos, dest_pos);

			if(r.getIsComplete()) {
				throw new RuntimeException("is complete should be intialized to false");
			}
			
			if(6 != r.getRideTime()) {
				throw new RuntimeException("ride time should equal 6");
			}
			
			CompletedRide cr1 = r.complete(d);
			
			if( ! (client_pos .equals(r.getClientPosition() ) ) ) {
				throw new RuntimeException("client position is falsely initalized");
			}
			
			if( ! (dest_pos .equals(r.getDestination() ) ) ) {
				throw new RuntimeException("destination position is falsely initalized");
			}
			if(!r.getIsComplete() ) {
				throw new RuntimeException(" r should be true");
			}
			
			if(6 != r.getRideTime()) {
				throw new RuntimeException("ride time should equal 6");
			}

			CompletedRide cr2 = r.complete(d);
	
			
			if(!( cr1.equals(cr2)) ) {
				throw new RuntimeException("cr1 does not equal cr2");
			}
			
			/**
			
			
			assertEquals(cr1, cr2);
			assertEquals(client_pos, r.getClientPosition());
			assertEquals(dest_pos, r.getDestination());
			assertTrue(r.getIsComplete());
			assertEquals(6, r.getRideTime());		
		**/
			
			System.out.println("Test passed");

}
	
}