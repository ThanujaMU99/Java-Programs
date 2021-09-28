class Museum{

String name;
String location;
int cost;
String famousFor;

public Museum(){
this("Kempegowda Museum","Bangalore",200,"glassed floor");
System.out.println("Museum object is created");

} 
public Museum(String name,String location,int cost,String famousFor){
this.name=name;
this.location=location;
this.cost=cost;
this.famousFor=famousFor;
}
public void displayMuseum(){

System.out.println(this.name+" "+location+" "+cost+" "+famousFor);
}


}