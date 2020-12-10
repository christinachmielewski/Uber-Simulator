package carDriver;

public class RideRequestImpl implements RideRequest {
	
	private Position clientPosition;
	private Position destination;
	private boolean isComplete = false;
	private CompletedRide impl;


	public RideRequestImpl (Position clientPosition, Position destination) {
		
		if(clientPosition == null) {
			throw new RuntimeException ("client position is null");
		}
		if(destination == null) {
			throw new RuntimeException ("destination is null");
		}
		
		this.clientPosition= clientPosition;
		this.destination=destination;
			
		
	} //end constructor
	
	public Position getClientPosition () {
		return clientPosition;
	}
	public Position getDestination() {
		return destination;
	}
	public boolean getIsComplete() {
		return isComplete;
	}
	
	
	

	public CompletedRide complete(Driver driver) {
		//isComplete = true;
		
		if (isComplete)
		{
			return impl;
		}
		
		if (clientPosition.getManhattanDistanceTo(destination)==0)
		{
			CompletedRide ride;
			CompletedRide impl = new CompletedRideImpl(this,driver);
			ride = impl;
			return ride;
		}
		else
		{	isComplete = true;
			impl = new CompletedRideImpl(this,driver);
			driver.getVehicle().moveToPosition(clientPosition);
			driver.getVehicle().moveToPosition(destination);
			return impl;
		}
	}

	
	public int getRideTime () {
		return clientPosition.getManhattanDistanceTo(destination);
		
	}
}
