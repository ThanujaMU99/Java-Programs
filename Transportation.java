class Transportation{

String nameOfTransportation;
String location;
int cost;

public Transportation(){
this("Bus","Tiptur",160);
System.out.println("Transportation object is crested");
}
public Transportation(String nameOfTransportation,String location,int cost){
this.nameOfTransportation=nameOfTransportation;
this.location=location;
this.cost=cost;

}
public void displayTransportationDetails(){
System.out.println(this.location+" "+cost);

}


}

