package com.revature.abstraction;

public abstract class MyAbstractClass {
	//can include instance variables that can be any access modifier
	//can include both concrete and abstract methods
	
	public abstract void myAbstractMethod(); //abstract mehto
	//For abstract methods, DONT put {}. use ";"
	
	
	public void myConcreteMethod() //concrete method
	{
		System.out.println("We can still provide some implementation in the abstract class through concrete methods");
	}
	
	
	
	
}

