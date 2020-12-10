package carDriver;

/*
 * RideRequest
 * Represents a request by a client for a ride between their current
 * position and some destination.
 * 
 * getClientPosition()
 *    Retrieves the client position at the time the ride request was
 *    created.
 *    
 * getDestination()
 *    Retrieves the destination position.
 *    
 * getIsComplete()
 *    Returns true if this request has been completed, false if not.
 *    A new RideRequest starts off as not completed and becomes completed
 *    if the complete method (see below) is invoked.
 *    
 * complete(Driver driver)
 *    If the RideRequest has not yet been completed, the method should:
 *    - update the request to indicate that the request has been completed,
 *    - create a CompletedRide object that captures information
 *      about the completed ride (see CompletedRide interface)
 *    - move the vehicle of the driver to the position of the client and 
 *      then move the vehicle to the destination of the ride,
 *    - and finally return the CompletedRide object.
 *    
 *    If the RideRequest has already been completed, simply returns
 *    the CompletedRide object describing the completed ride.
 *   
 * getRideTime()
 *    Returns the Manahattan distance between the client position and the
 *    destination position as a measure of how long the requested ride
 *    will take.
 */

public interface RideRequest {

	Position getClientPosition();
	Position getDestination();
	boolean getIsComplete();
	CompletedRide complete(Driver driver);
	int getRideTime();

}
