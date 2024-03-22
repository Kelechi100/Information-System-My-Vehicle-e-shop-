package model;

public class Bus extends Vehicle{
	private int numberOfSeat;
	private boolean hasBaggageDivision;
	
	// setters and getters 
	
	public int getNumberOfSeat() {
		return numberOfSeat;
	}
	public void setNumberOfSeat(int numberOfSeat) {
		if(numberOfSeat > 10 && numberOfSeat < 1000)
			this.numberOfSeat = numberOfSeat;
		else
			numberOfSeat = 10;
	}
	public boolean isHasBaggageDivision() {
		return hasBaggageDivision;
	}
	public void setHasBaggageDivision(boolean hasBaggageDivision) {
		this.hasBaggageDivision = hasBaggageDivision;
	}
	//  constructors
	public Bus()
	{
		super();
		setNumberOfSeat(10);
		setHasBaggageDivision(hasBaggageDivision);
	}
	
	// TOString
	public String toString()
	{
		return super.toString() + " " +  numberOfSeat + " "  + hasBaggageDivision;
	}
}
