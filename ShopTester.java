package com.xworkz.lightapp;

public class ShopTester {
	public static void main(String a[]) {
		Shop shop = new HotelImplementation();
		shop.serve();
		
		Shop shop1 = new BakeryImp();
		shop1.serve();
		
		Shop shop2 = new MedicalStoreImp();
		shop2.serve();
		
		Shop shop3 = new ResturentImp();
		shop3.serve();
		
		Shop shop4 = new BeautyParlour();
		shop4.serve();
	}

}
