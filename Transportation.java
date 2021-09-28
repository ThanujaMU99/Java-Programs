class Transportation{

  String typeOfTransportation;
  String location;
  int cost;
  
public Transportation(){
 this("Train","Tiptur",30);
System.out.println("Transportation object is created");

}


public Transportation(String type,String lc,int ct){

  typeOfTransportation=type;
  location=lc;
  cost=ct;

}

public void displayDetails(){

System.out.println(typeOfTransportation+" "+location+" "+cost);

}

}