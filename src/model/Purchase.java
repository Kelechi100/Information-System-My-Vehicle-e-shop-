package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Purchase {
	private String userCardNr;
	private LocalDateTime dateTime;
	private ArrayList<Vehicle> shoppingList;
	
	// setter and getters
	public String getUserCardNr() {
		return userCardNr;
	}
	public void setUserCardNr(String userCardNr) {
		if(userCardNr != null && userCardNr.matches("[0-9]{6}-[0-9]{5}"))
			this.userCardNr = userCardNr;
		else
			this.userCardNr = "Undifined";
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime() {
		this.dateTime = LocalDateTime.now();
	}
	public ArrayList<Vehicle> getShoppingList() {
		return shoppingList;
	}
	public void setShoppingList(ArrayList<Vehicle> shoppingList) {
		if(shoppingList != null) {
			this.shoppingList = shoppingList;
		}
		else
			this.shoppingList = new ArrayList<Vehicle>();
		
	}
	
	// COnstructors
	public Purchase() {
		setUserCardNr("123456-67895");
		setDateTime();
		setShoppingList(new ArrayList<Vehicle>());
		
	}
	public Purchase(String userCardNr, ArrayList<Vehicle> shoppingList)
	{
		setUserCardNr(userCardNr);
		setDateTime();
		setShoppingList(new ArrayList<Vehicle>());
	}
	
	// To String
	public String toString()
	
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/ MM/dd  HH: mm: ss");
		return "cardNumber: " + userCardNr + " " + " Date & Time: "+  dateTime.format(formatter)+  " " + "ShoppingList: " + shoppingList.size();
		
	}

}
