package carDriver;

public class VehicleImpl implements Vehicle{

	private String make;
	private String model;
	private String plate;
	private Position position;
	private int mileage = 0;
	
	public VehicleImpl(String make, String model, String plate, Position position) {
		if(position == null) {
			throw new RuntimeException("position is null in VehicleImpl constructor");
		}
		if(make == null) {
			throw new RuntimeException("make is null");
		}
		if(model == null) {
			throw new RuntimeException("model is null");
		}
		if(plate == null) {
			throw new RuntimeException("plate is null");
		}
		
		this.make=make;
		this.model=model;
		this.plate=plate;
		this.position=position;
		
	}
	
	
	
	public String getMake () {
		return make;
	}
	
	public String getModel () {
		return model;
	}
	
	public String getPlate () {
		return plate;
	}
	
	
	public int getMileage () {
		return mileage;
	}
	
	public Position getPosition () {
		return position;
	}
	
	public void moveToPosition (Position p) {
		if(p == null) {
			throw new RuntimeException("position p is null in moveToPosition");
		}
		// add the M distance between current position and the position p 
		//update current position to be p
		mileage+=position.getManhattanDistanceTo(p);
		position = p;
		
	}
	
}
/** 
 * moveTo(Position p)
 *    Updates the mileage of the vehicle by adding the Manhattan
 *    distance between the vehicle's current position and the
 *    position p passed in as a parameter. Then updates the 
 *    vehicle's current position to be p.
 */