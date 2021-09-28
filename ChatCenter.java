class ChatCenter{
    
	String centerName;
	int centerId;
	String location;
	String ownerName;
	boolean isOpen;
	String items[]={"Pani puri","Gobi","Samosa"};
	
	
public ChatCenter(){
	
this("Virabhadreshware","Tiptur",23," Ranganath",true);
System.out.println("ChatCenter object is created");

}

public ChatCenter(String centerName,String location,int centerId,String ownerName,boolean isOpen){
	
	this.centerName=centerName;
	this.location=location;
	this.items=items;
	this.centerId=centerId;
	this.ownerName=ownerName;
	this.isOpen=isOpen;
	
}

//public ChatCenter(int centerId,String ownerName,boolean isOpen){
	
	//this.cente=centerId;
	//this.ownerName=ownerName;
	//this.isOpen=isOpen;
	
//}


public void displayDetails(){
	
	System.out.println(this.centerName+" "+this.centerId+" "+this.location+" "+this.ownerName+" "+this.isOpen);
	
}

public void getItems(){
	
	for( int i=0;i<this.items.length;i++){
		
		
		System.out.println(this.items[i]);
	}
  }
}