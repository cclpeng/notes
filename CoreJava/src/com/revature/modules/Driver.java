package com.revature.modules;

public class Driver{
	public static void main(String[] args)
	{
		Vehicle car = new Vehicle();
		Vehicle car2 = new Vehicle();
		
//		System.out.println(car1);				TODO fix these two...not able to override?
//		System.out.println(car1.equals(car2));   //must override .equals method
		
		Vehicle myVehicle = new Vehicle();
		HybridCar myHybrid = new HybridCar();
		
		System.out.print("Declaring a vehicle: ");
		HybridCar fusion = new HybridCar();
		myVehicle.setSpeed(5);
		myVehicle.setSpeed(10);
		System.out.println();
		
		System.out.println("Declare a  car object:");
		myHybrid.setSpeed(5);
		myHybrid.setSpeed(10);
		System.out.println();
		
		
		
		Vehicle.staticMethod();
		HybridCar.staticMethod();  //only prints static method from Vehicle, not Hybrid class :O
								//hybridcar method isn't overriding vehicle's method. 
	}
	
//	@Override      <====THIS GOES IN VEHICLE LOL
//	public boolean equals(Object obj)
//	{
//		if(this == obj)		//at least the classes are the same
//			return true;
//		if(obj == null)
//			return false;
//		if(getClass() != obj.getClass())
//			return false;
//		Vehicle other = (Vehicle) obj;    //typecast argument obj so u can use the setters
//		
//		if(speed != other.speed)
//			return false;
//		if(hasWheels != other.hasWheels)
//			return false;
//		if(direction != other.direction)
//			return false;
//		return true;
//	}
}
