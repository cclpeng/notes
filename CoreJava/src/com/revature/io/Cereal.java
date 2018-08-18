package com.revature.io;

import java.io.Serializable;

//this is the class were going to Serialize
public class Cereal implements Serializable {    //NOT SUPPOSED TO HAVE TO IMPORT????? BUT GAVE ERROR
	
	private static final long serialVersionUID = 123456;  //HELP FIXME
	private boolean hasMarshmallows;
	private transient int calories;	//If transient, will make var default value
	private transient int sugar;
	private String name;
	
	
	
	public Cereal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cereal(boolean hasMarshmallows, int calories, int sugar, String name) {
		super();
		this.hasMarshmallows = hasMarshmallows;
		this.calories = calories;
		this.sugar = sugar;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Cereal [hasMarshmallows=" + hasMarshmallows + ", calories=" + calories + ", sugar=" + sugar + ", name="
				+ name + "]";
	}

	public boolean isHasMarshmallows() {
		return hasMarshmallows;
	}
	public int getCalories() {
		return calories;
	}
	public int getSugar() {
		return sugar;
	}
	public String getName() {
		return name;
	}
	public void setHasMarshmallows(boolean hasMarshmallows) {
		this.hasMarshmallows = hasMarshmallows;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
