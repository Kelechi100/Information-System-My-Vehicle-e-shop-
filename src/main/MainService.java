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
		System.out.println("----------------------------------------------------------------------------------------");
		Purchase p1 = new Purchase("123456-67895", new ArrayList<Vehicle>(Arrays.asList(b1)));
		Purchase p2 = new Purchase("123456-67895", new ArrayList<Vehicle>(Arrays.asList(b1, b1, t1, t2)));
		allPurchases.addAll(Arrays.asList(p1,p2));
		
		for (Purchase temP: allPurchases) {
			System.out.println(temP);
		}
		
			try {
				System.out.println("GetById:" + getBusById(0));
				System.out.println("GetbyCode" + getBusByVehicleCode("0_Tesla"));
				
				createNewbus("Toyota", 400.0f, 700, Energy_type.hybrid, 36, true  );
				System.out.println("Creating New Bus ");
				for(Vehicle tempV: allVehicles) {
					if(tempV instanceof Bus)
					{
						Bus tempB = (Bus)tempV;
						System.out.println(tempB);
					}
				}
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
	
		
		
	}
	
	// creating CRUD (Create , Update, Retrieve, Delete)
	
	public static  Bus getBusById(int inputBusID) throws Exception{
		if(inputBusID < 0 )
			throw new Exception("Input Error");
		for(Vehicle tempV: allVehicles) {
			if(tempV instanceof Bus && tempV.getId()==inputBusID) {
				return(Bus)tempV;
			}
		}
		throw new Exception("Sorry bus not found");
	}
	public static Bus getBusByVehicleCode(String vehicleCode) throws Exception{
		if(vehicleCode == null)
			throw new Exception("Wrong Input");
		for(Vehicle tempV: allVehicles) {
			if(tempV instanceof Bus && tempV.getVehicleCode().equals(vehicleCode)) {
				return(Bus)tempV;
			}
		}
		throw new Exception("Bus COde is not found");
	}
	public static void createNewbus(  String inputtitle,float inputprice, int inputquantity,Energy_type inputeType, int inputumberOfSeat,boolean inputHasBaggagedivision)throws Exception{
		if( inputtitle == null || inputprice  < 0 || inputquantity < 0 || inputeType == null) throw  new Exception ("wrong Input");
		for(Vehicle tempV: allVehicles) {
			if(tempV instanceof Bus && tempV.getTitle().equals(inputtitle) && tempV.geteType().equals(inputeType)){
				throw new Exception("Error bus already Exists");
					
				 
				
			}
			
		}
		Bus Newb3 = new Bus(inputtitle, inputprice,inputquantity,inputeType, inputumberOfSeat, false);
			allVehicles.add(Newb3);
	}

}
