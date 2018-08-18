package com.revature.modules;

import java.io.Serializable;

public class HybridCar extends Vehicle implements Serializable, Cloneable {
	private int chargeTime;
	private String model;
	private String make;
	public HybridCar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HybridCar(int speed, boolean hasW, int d) {
		super(speed, hasW, d);
		// TODO Auto-generated constructor stub
	}
	public int getChargeTime() {
		return chargeTime;
	}
	public String getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	public void setChargeTime(int chargeTime) {
		this.chargeTime = chargeTime;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMake(String make) {
		this.make = make;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + chargeTime;
//		result = prime * result + ((make == null) ? 0 : make.hashCode());
//		result = prime * result + ((model == null) ? 0 : model.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HybridCar other = (HybridCar) obj;
		if (chargeTime != other.chargeTime)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	public static void staticMethod()
	{
		System.out.println("Static method from hybrid car class");
	}
	
	
	
	
}
