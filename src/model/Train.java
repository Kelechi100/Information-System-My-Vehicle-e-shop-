package model;

public class Train extends Vehicle {
	private String additionalTechnique;
	private boolean isOnlyLargeTires;
	
	
	// setters and getters
	public String getAdditionalTechnique() {
		return additionalTechnique;
	}
	public void setAdditionalTechnique(String additionalTechnique) {
		if(additionalTechnique != null )
			this.additionalTechnique = additionalTechnique;
		else
			this.additionalTechnique = "it has  3 unique features";
	}
	public boolean isOnlyLargeTires() {
		return isOnlyLargeTires;
	}
	public void setOnlyLargeTires(boolean isOnlyLargeTires) {
		this.isOnlyLargeTires = isOnlyLargeTires;
	}
	
	// contsrtuctors
	public Train()
	{
		super();
		setAdditionalTechnique(additionalTechnique);
		setOnlyLargeTires(isOnlyLargeTires);
	}
	public Train(String title, float price, int quantity,Energy_type eType, String additionalTechnique, boolean isOnlyLargeTires)
	{
		super(title, price, quantity, eType);
		setAdditionalTechnique(additionalTechnique);
		setOnlyLargeTires(isOnlyLargeTires);
	}
	// ToString
	public String toString()
	{
		return super.toString() + " " + additionalTechnique + " " + isOnlyLargeTires;
	}
}
