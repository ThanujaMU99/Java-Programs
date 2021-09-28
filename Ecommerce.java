class Ecommerce{

 String typesOfEcommerence;
 int growthInEcommerenceInPercentage;
 String bestEcommerence;
 
public Ecommerence(){
this("Three",36,"Best Overall BigCommerce");
System.out.println("Ecommerence object is created");

}

public Ecommerence(String types,int growth, String bestE){

   this.typesOfEcommerence=types;
   this.growthInEcommerenceInPercentage=growth;
   this.bestEcommerence=bestE;
}

public void displayDetails(){

System.out.println(typesOfEcommerence+" "+growthInEcommerenceInPercentage+" "+bestEcommerence);
}
}