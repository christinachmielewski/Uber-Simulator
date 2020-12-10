package carDriver;

public class DriverImpl implements Driver{

private String first;
private String last;
private int id;
private Vehicle vehicle;
	
	public DriverImpl(String first, String last, int id, Vehicle vehicle) {
		
		if(vehicle == null) {
			throw new RuntimeException("vehicle is null in DriverImpl constructor");
		}
		if(first == null) {
			throw new RuntimeException("first is null");
		}
		if(last == null) {
			throw new RuntimeException("last is null");
		}
		
		this.first = first;
		this.last=last;
		this.id=id;
		this.vehicle = vehicle;
		

	}
	
public String getFirstName () {
	return first;
}

public String getLastName () {
	return last;
}

public String getFullName () {
	return (getFirstName() + " "+ getLastName());
}

public int getID () {
	return id;
}

public Vehicle getVehicle() {
	return vehicle;
}

public void setVehicle(Vehicle v) {
	if(v == null) {
		throw new RuntimeException("v is null in setVehicle");
	}
	this.vehicle=v;
}



}