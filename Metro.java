class Metro{

String name;
String color;
int amount;
String noOfMetroStation[]={"Rajajinagar","Jalahalli","Jayanagar","dasarahalli"};

public Metro(){
this("Namma Metro","Green",100);
System.out.println("Metro object is created");
}

public Metro(String name,String color,int amount){
this.name=name;
this.color=color;
this.amount=amount;
}
public void displayMetrodetails(){
System.out.println(this.name+" " +color+" " +amount);
}
public void getnoOfMetroStation(){
	for(int i=0;i<this.noOfMetroStation.length;i++){
		System.out.println(this.noOfMetroStation[i]);
}
}


}