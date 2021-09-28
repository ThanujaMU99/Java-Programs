class Museum{

   String name;
   String famousFor;
   String location;
   int entryCost;
   
   
public Museum(){
this("Visvesvaraya Industrial and Technological Museum","Engine Hall","Bangalore",75);

System.out.println("Museum object is created");

}

public Museum(String name,String famousFor,String location,int entryCost){

  this.name=name;
  this.famousFor=famousFor;
  this.location=location;
  this.entryCost=entryCost;

}

public void displayDetails(){

System.out.println(this.name+" "+ this.famousFor+" "+this.location+" "+ this.entryCost);

}

}