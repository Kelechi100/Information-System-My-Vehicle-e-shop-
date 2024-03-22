package model;

import model.Energy_type;

public class Vehicle {
	private int id;
	private String title;
	private String vehicleCode;
	private float price;
	private int quantity;
	private Energy_type eType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVehicleCode() {
		return vehicleCode;
	}
	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Energy_type geteType() {
		return eType;
	}
	public void seteType(Energy_type eType) {
		this.eType = eType;
	}
	
	
// setters and getters
	

}
