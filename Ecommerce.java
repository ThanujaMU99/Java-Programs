class Ecommerce{

 String typesOfEcommerce;
 int growthInEcommerceInPercentage;
 String bestEcommerce;
 
public Ecommerce(){
this("Three",36,"Best Overall: BigCommerce");
System.out.println("Ecommerce object is created");

}

public Ecommerce(String types,int growth, String bestE){

   this.typesOfEcommerce=types;
   this.growthInEcommerceInPercentage=growth;
   this.bestEcommerce=bestE;
}

public void displayDetails(){

System.out.println(typesOfEcommerce+" "+growthInEcommerceInPercentage+" "+bestEcommerce);
}
}