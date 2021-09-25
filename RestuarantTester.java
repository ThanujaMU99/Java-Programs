class RestuarantTester{

public static void main(String a[]){


	Restuarant rest  = new Restuarant();
	rest.restuarantName = "1947";
	rest.type = "Veg";
	rest.location = "Malleshwaram";
	rest.ownerName = "sadanand Gowda";
	rest.restuarantId = 456;
rest.serveFood();
rest.dislpayRestuarantDetails();



Restuarant rest1  = new Restuarant();
	rest1.restuarantName= "Empire";
	rest1.type = "Non-Veg";
	rest1.location = "Kormangala";
	rest1.ownerName = "Somesh";
	rest1.restuarantId = 264;
rest1.serveFood();
rest1.dislpayRestuarantDetails();

Restuarant rest2  = new Restuarant();
	rest2.restuarantName = "Grand";
	rest2.type = "Veg";
	rest2.location = "Yashwanthpura";
	rest2.ownerName = "xyz";
	rest2.restuarantId = 450;


rest2.serveFood();
rest2.dislpayRestuarantDetails();



}


}