package main;

import java.util.ArrayList;
import java.util.Arrays;

import model.Bus;
import model.Energy_type;
import model.Purchase;
import model.Train;
import model.Vehicle;


public class MainService {
	public static ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();
	private  static ArrayList<Purchase> allPurchases = new ArrayList<Purchase>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b1 = new Bus();
		Bus b2 = new Bus("Bummer", 400.0f, 500, Energy_type.diesel, 34, false);
		Train t1 = new Train();
		Train t2 = new Train("Icetrain", 43.0f, 300, Energy_type.hybrid, "Trilling", true);
		allVehicles.addAll(Arrays.asList(b1, b2, t1, t2));
		
	
		for(Vehicle tempV : allVehicles) {
			System.out.println(tempV.getClass().getName() + "->" + tempV);
		}
		Purchase p1 = new Purchase("123456-67895", new ArrayList<Vehicle>(Arrays.asList(b1)));
		Purchase p2 = new Purchase("123456-67895", new ArrayList<Vehicle>(Arrays.asList(b1, b1, t1, t2)));
		allPurchases.addAll(Arrays.asList(p1,p2));
		
		for (Purchase temP: allPurchases) {
			System.out.println(temP);
		}
	}

}
