class Restuarant{

public int restuarantId;
public String  restuarantName;
public String type;
public String location;
public String ownerName;

public  Restuarant(){
System.out.println("Restuarant object is created");

}

public void serveFood(){
System.out.println("Serving food with delicious items");
}

public void dislpayRestuarantDetails(){
	System.out.println(restuarantId +" "+restuarantName+" " +type+" " +location+" " +ownerName);

}

}