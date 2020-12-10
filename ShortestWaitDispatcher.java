package carDriver;

public class ShortestWaitDispatcher implements Dispatcher {
	
	
	private int indexShortest;
	
	public ShortestWaitDispatcher () {
		indexShortest=0;
	}
	
	
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		
	int shortestDistance = availableDrivers[0].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
	
	for (int i = 1 ; i < availableDrivers.length ; i++) {	
	int tempD = availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
	if(tempD < shortestDistance) {
		tempD = shortestDistance;
		indexShortest = i;
	}
	
	} 
	return availableDrivers[indexShortest];
	}
	
	
}
