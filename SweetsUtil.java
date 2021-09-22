class SweetsUtil{

public static void main(String a[]){

	Sweets sweet = new Sweets();
	sweet.name = "Doodh Peda";
	sweet.cost = 50;
	sweet.color = "Orange";
	sweet.flavours = "Cocoa";
	System.out.println(sweet.name+" " +sweet.cost+" " +sweet.cost+" " +sweet.flavours);
	
sweet.taste();

Sweets sweet1 = new Sweets();
	sweet1.name = "Barfi";
	sweet1.cost = 500;
	sweet1.color = "White";
	sweet1.flavours = "Kaju";
	System.out.println(sweet1.name+" " +sweet1.cost+" " +sweet1.cost+" " +sweet1.flavours);
	
sweet1.taste();
	
	Sweets sweet2 = new Sweets();
	sweet2.name = "yogurt";
	sweet2.cost = 60;
	sweet2.color = "yellow";
	sweet2.flavours = "Mango";
	System.out.println(sweet2.name+" " +sweet2.cost+" " +sweet2.cost+" " +sweet2.flavours);
	
sweet2.taste();
}


}