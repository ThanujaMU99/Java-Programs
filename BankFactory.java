package com.xworkz.lightapp;

public class BankFactory {
	public static ICard  getWithdrawMoney(String type) {
		
		if(type.equals("SBICardImplimentation")) {
			return new SBICardImplimentation();
		}
		else if(type.equals( "ICICICardImp" )) {
			return new ICICICardImp ();
		}
		else {
			System.out.println("bank not found");
		}
		return null;
	}

}
