package com.revature.abstraction;

public class Driver {
	public static void main(String[] args)
	{
		InterfaceImpl impl = new InterfaceImpl();
		impl.doSomething();
		impl.doSomethingElse();
		
		System.out.println(InterfaceA.MY_INT);
		System.out.println();
		impl.myAbstractMethod();        
		impl.myConcreteMethod();
		//can't instantiate myabstract class
//		MyAbstractClass ac = new MyAbstractClass();
	}
}
