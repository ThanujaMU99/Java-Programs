class Appliances{

String brandName;
int cost;
String location;
String nameOfTheAppliances[]={"Washing Machine","Refrigerator","Blender","Television"};


public Appliances(){
this("Butterfly",5000,"Rajajinagar");
System.out.println("Appliances object is created");
}

public Appliances(String brandName,int cost,String location){
this.brandName=brandName;
this.cost=cost;
this.location=location;
}
public void displayAppliances(){
System.out.println(this.brandName+" "+cost+" "+location);
}
public void nameOfTheAppliances(){
for(int i=0;i<this.nameOfTheAppliances.length;i++){
System.out.println(this.nameOfTheAppliances[i]);
}
}

}