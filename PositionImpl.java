package carDriver;

public class PositionImpl implements Position{

private int x;
private int y;

public PositionImpl (int x, int y) {
	this.x=x;
	this.y=y;
}

public int getX() {
	return x;
}

public int getY() {
	return y;
}

public int getManhattanDistanceTo(Position p) {
	if(p == null) {
		throw new RuntimeException("p is null in getManhattanDistance");
	}
	int absX = Math.abs(x-p.getX());
	int absY = Math.abs(y-p.getY());
	return absX + absY;
}
	
}// end class
/* 
 * Position
 * Represents an integer (x,y) position on a grid.
 *  
 * getX()
 *   Retrieves x coordinate of the position
 *  
 * getY()
 *   Retrieves y coordinate of the position
 *   
 * getManhattanDistanceTo(Position p)
 *   Calculates the "Manhattan" distance between two positions.
 *   The Manhattan distance is simply the absolute difference in x positions
 *   summed with the absolute difference in y positions.
 */