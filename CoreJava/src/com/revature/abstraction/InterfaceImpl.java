package com.revature.abstraction;

//if extends and implements, dont put a comma
public class InterfaceImpl extends MyAbstractClass implements InterfaceA, InterfaceB {

	@Override
	public void doSomething()
	{
		System.out.println("doing something...");
	}
	
	public void doSomethingElse()		//why do we need to add this again? for some reason compiler 
	{									//gets multiple inheritance issue
//		System.out.println("third implementation");
		InterfaceA.super.doSomethingElse();		//what does this do?
	}
	
	
	
	@Override //must add to not make errors from extending myabstract
	public void myAbstractMethod()
	{
		System.out.println("My abstract method (from InterfaceImpl.java ln 23)");
	}
	
}
