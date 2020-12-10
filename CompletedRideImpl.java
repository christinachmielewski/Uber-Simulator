package carDriver;

public class CompletedRideImpl implements CompletedRide {
	
	private RideRequest request;
	private Driver driver;
	private int waitTime;
	
	public CompletedRideImpl(RideRequest request, Driver driver){
		if(request == null ) {
			throw new RuntimeException("request is null");
		}
		if(driver == null) {
			throw new RuntimeException("driver is null");
		}
		this.request=request;	
		this.driver=driver;
		waitTime = request.getClientPosition().getManhattanDistanceTo(driver.getVehicle().getPosition());

	}// end constructor
	public RideRequest getRequest() {
		return request;
	}
	
	public Driver getDriver() {
		return driver;
	}
	public int getWaitTime () {
		return waitTime;
	}
	public int getTotalTime () {
		return getWaitTime() + request.getRideTime();
	}
	public double getCost () {
		return ( request.getRideTime()*0.5 + getWaitTime()*0.1 );
	}
	public double getPrice () {
		
		int wT = getWaitTime();
		
		if(wT<25)
		{
			return request.getRideTime() *2.5;
		} 
		else if(wT<50) 
		{
			return request.getRideTime() *2;
		} 
		else if(wT<100) 
		{
			return request.getRideTime();
		} else {
		
		
			return request.getRideTime() / 2;
		}
		
		
	}
	public double getProfit() {
		return getPrice() - getCost();
	}
}

