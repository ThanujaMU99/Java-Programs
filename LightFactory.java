package com.xworkz.lightapp;

//factory class - object creation logic
public class LightFactory {
	
	//factory method
	public static Switch getLight(String type) {
		if(type.equals("tubeLight")) {
			return new TubeLightImplementation();
		}
		else if(type.equals("cflBulb")) {
			return new CflBulbImp();
			
		}
		else {
			System.out.println("light not found");
		}
		return null;
	}

}
