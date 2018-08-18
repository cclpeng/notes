package com.revature.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.revature.modules.HybridCar;


//reflection is an api, a library of methods that you can use to access code from other files
//and manipulate them like in the examples below
public class ReflectionDriver {

	public static void main(String[] args) {
		try {
			//getting the HybridCar class
			Class c1 = Class.forName("com.revature.models.HybridCar");
			System.out.println("Class: "+ c1.getName());
			System.out.println("Superclass: "+ c1.getSuperclass());
			System.out.println("Grandparent Class: "+ c1.getSuperclass().getSuperclass());
			
			//get the interfaces implemented by our hybridcar class
			Class[] interfaces = c1.getInterfaces();
			for(Class interf : interfaces) {
				System.out.println(interf);
			}
			System.out.println();
			
			//access methods within the class
			System.out.println("Methods: ");
			Method[] methods = c1.getDeclaredMethods(); 		//right click "Method[]" to import
			for(Method method : methods)
			{
				System.out.println(method.toString());
			}
			
			//access fields within the class
			System.out.println("Fields: ");
			Field[] fields = c1.getDeclaredFields();			//java lang reflect import
			for(Field field : fields)
			{
				System.out.println(field);
			}
			Field[] superFields = c1.getSuperclass().getDeclaredFields();
			
			
			//we can create an instance of a HybridCar using only its class
			
			HybridCar car = (HybridCar) c1.newInstance(); //ADD CATCH CLAUSE TO SURROUNDING TRY right 
					//click newInstance
			System.out.println(car.toString());
			
			
			//we can modify and manipulate fields within the class
			Field chargeTimeField = c1.getDeclaredField("chargeTime");  //add catch clause
			chargeTimeField.set(car, 60);
			chargeTimeField.setAccessible(false);
			System.out.println(car.toString());
			
			
			//can also call methods within our class at runtime
			Method setChargeTimeMethod = c1.getDeclaredMethod("setChargeTime", int.class);
			//add catch clause
			setChargeTimeMethod.invoke(car,  70);		//add catch clause
			System.out.println(car.toString());
			
			
		}	catch(ClassNotFoundException e) {
				e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
