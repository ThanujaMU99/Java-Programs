package com.xworkz.lightapp;
import java.util.Scanner;
public class SBICardTester {
	public static void main(String a[]) {
		Scanner type = new Scanner(System.in);
		System.out.println("enter the bank");
	
		
		ICard card = BankFactory.getWithdrawMoney(type.next());
		if(card != null) {
			card.swipe();
		}
	}

}
