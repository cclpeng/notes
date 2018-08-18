package com.revature.modules;
//package com.revature.models;

import com.revature.exceptions.NegativeSpeedException;

public class Vehicle 
{
	protected int speed;
	protected boolean hasWheels;
	protected int direction; 
	// need default constructors, defined constructors, getters, setters
	
	public Vehicle() 
	{
		super();    //refers to superclass? look up l8r
	}
	
	public Vehicle(int speed, boolean hasW, int d)
	{
		this.speed = speed;       
		hasWheels = hasW;
		direction = d;
	}
	
	public void setSpeed(int speed)
	{
		if(speed < 0)
			try {
				throw new NegativeSpeedException("cannot go negative speed");
			} catch (NegativeSpeedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); //or sysout "exception handled"
			}
			//can also do
		//  
		this.speed = speed;
	}
	
	public int getSpeed() 
	{
			return this.speed;
		
	}

	public boolean isHasWheels() {
		return hasWheels;
	}

	public int getDirection() {
		return direction;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)		//at least the classes are the same
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;    //typecast argument obj so u can use the setters
		
		if(speed != other.speed)
			return false;
		if(hasWheels != other.hasWheels)
			return false;
		if(direction != other.direction)
			return false;
		return true;
	}

	@Override				//generate to string under source
	public String toString() {
		return "Vehicle [speed=" + speed + ", hasWheels=" + hasWheels + ", direction=" + direction + "]";
	}
	
//	public String toString() {}
	
	public static void staticMethod() {
		System.out.println("static method from Vehicle class");
	}
}




