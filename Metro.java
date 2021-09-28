class Metro{

  String name;
  String color[]={"Purple","green","pruple"};
  int amount;
  String location;
  
  
public Metro(){
this("Namma Metro",150,"Bangalor");

System.out.println("Metro object is created");
}


public Metro(String name, int amount ,String location){

    this.name=name;
	this.amount=amount;
	this.location=location;
	this.color=color;
	
	}
	
	
public void displayDetails(){

System.out.println(name+" "+amount+" "+this.location+" "+this.color);

}

public void getColor(){

for(int i=0;i<this.color.length;i++){
   System.out.println(this.color[i]);
  }

   }
}