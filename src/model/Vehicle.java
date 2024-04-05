package model;


public abstract class Vehicle {
	private int id;
	private String title;
	private String vehicleCode;
	private float price;
	private int quantity;
	private Energy_type eType;
	
	private long ID;
	
	private static long counter = 0;
	// setters and getters
	public int getId() {
		return id;
	}
	
	public void setId() {
		this.ID = counter;
		counter++;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && title.matches("[A-Z]{1}[a-z]{1,20}"))
			this.title = title;
		else
			this.title = "-----------";
		
	}
	public String getVehicleCode() {
		return vehicleCode;
	}
	public void setVehicleCode() {
			this.vehicleCode = ID + "_" + title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price > 0 && price < 1000000 ) 
			this.price = price;
		else
			this.price = 1000;
	}
	public int getQuantity() {
	
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity > 0 && quantity < 1000)
			this.quantity = quantity;
		else
			this.quantity = 1;
	}
	public Energy_type geteType() {
		return eType;
	}
	public void seteType(Energy_type eType) {
		if(eType != null)
			this.eType = eType;
		else
			this.eType = Energy_type.not_specified;
	}
	
	// constructors
	public Vehicle() {
		setId();
		setTitle("Tesla");
		setPrice(20000.06f);
		setQuantity(10);
		setVehicleCode();
		seteType(Energy_type.hybrid);
	}
	public Vehicle(String title, float price, int quantity,Energy_type eType)
	{
		setId();
		setTitle(title);
		setPrice(price);
		setQuantity(quantity);
		setVehicleCode();
		seteType(eType);
	}
	
	//TOString 
	public String toString() 
	{
		return ID + " " + "Name: " + title +" " + "Price: "+ price + " " + "Vehiclecode: " + vehicleCode  + " " + "Quantiy: "+ quantity + " " +"Energy-Type: "+ eType;
	}
	
	

}
