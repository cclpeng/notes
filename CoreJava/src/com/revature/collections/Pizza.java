package com.revature.collections;

public class Pizza {
	private String[] toppings;
	private int slices;
	private int diameter;
	private String crustType;
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pizza(String[] toppings, int slices, int diameter, String crustType) {
		super();
		this.toppings = toppings;
		this.slices = slices;
		this.diameter = diameter;
		this.crustType = crustType;
	}
	public String[] getToppings() {
		return toppings;
	}
	public int getSlices() {
		return slices;
	}
	public int getDiameter() {
		return diameter;
	}
	public String getCrustType() {
		return crustType;
	}
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}
	public void setSlices(int slices) {
		this.slices = slices;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public void setCrustType(String crustType) {
		this.crustType = crustType;
	}
	
	
}
