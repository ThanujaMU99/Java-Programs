package com.xworkz.lightapp;
import java.util.Scanner;
public class TubeLightTester {
	public static void main(String a[]) {
		
		Scanner type = new Scanner(System.in);
		System.out.println("enter the light");
		
		//abstruction-utlization or consumer logic
		// it is definbed by user
		Switch iswitch = LightFactory.getLight(type.next());
		if(iswitch != null) {
		iswitch.sOn();
		iswitch.sOff();
		}
		
	}

}
