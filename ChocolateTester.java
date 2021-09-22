class ChocolateTester{

public static void main(String a[]){
	Chocolate taste = new Chocolate();
	taste.name = "Dairy Milk Silk";
	taste.cost = 175;
	taste.color = "Browen";
	taste.size = "Large";
	System.out.println(taste.name+" " +taste.cost+ " " +taste.color+" " +taste.size);
taste.flavour();
	
	Chocolate taste1 = new Chocolate();
	taste1.name = "5 Star3D";
	taste1.cost = 160;
	taste1.color = "Browen";
	taste1.size = "Medium";
	System.out.println(taste1.name+" " +taste1.cost+ " " +taste1.color+" " +taste1.size);
taste1.flavour();
	
	Chocolate taste2 = new Chocolate();
	taste2.name = "Milkybar";
	taste2.cost = 60;
	taste2.color = "White";
	taste2.size = "Small";
	System.out.println(taste2.name+" " +taste2.cost+ " " +taste2.color+" " +taste2.size);
taste2.flavour();
	
}

}