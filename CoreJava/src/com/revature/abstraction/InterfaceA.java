package com.revature.abstraction;

//can say "public abstract interface", but not necessary because implicitly abstract
public interface InterfaceA {

	//members of an interface are implicitly public
	//variables in interfaces are public, static, and final(cons for c++), then must be initialized
	int MY_INT = 5;     //final and static is a constant, then Naming convention is Capital, Underscore
	
	//methods are also defaulted to public, so not including 
	void doSomething();
	
	default void doSomethingElse()
	{
		System.out.println("Interface A is doing something else"); //WAT DOES DEFAULT DO? gogle
	}
}
