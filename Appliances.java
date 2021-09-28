class Appliances{

  String nameOfAppliancees;
  String brandName;
  int cost;
  String location;
  
  
public Appliances(){

this("HomeAppliances","Bosch",14350,"RajajiNagar");

System.out.println("Appliances object is created");

}

public Appliances(String name,String bN,int ct,String lc){
    nameOfAppliancees=name;
	brandName=bN;
	cost=ct;
	location=lc;
	
	}
	
	
	public void displayDetails(){
	
	System.out.println(nameOfAppliancees+" "+brandName+" "+cost+" "+location);
	
	}

}