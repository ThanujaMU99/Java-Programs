class ChatCentre{

 String  centreName;
 int centreId;
 String location;
 String ownerName;
 boolean isOpen;
 String items[]= {"pan puri","Kachori","Pav Bhaji","gobi","Sandwich"};
 
 
 public ChatCentre(){
	 this("Virabadreshwara","Tiptur",2,true ,"Ranganath");
	 
 System.out.println("ChatCentre object is created");
 }
 public ChatCentre(String centreName,String location	,int centreId, boolean isOpen,String ownerName){
	 this.centreName=centreName;
	 this.location=location;
	 this.items=items;
	 this.centreId=centreId;
	 this.isOpen=isOpen;
	 this.ownerName=ownerName;
}
//public ChatCentre(int centreId,boolean isOpen,String ownerName){
	//this.centreId=centreId;
	//this.isOpen=isOpen;
	//this.ownerName=ownerName;
//}
public void displayChatCentre(){
	System.out.println(this.centreName+" " +centreId+" " +ownerName+" " +location+" "+isOpen);
}
public void getItems(){
	for(int i=0;i<this.items.length;i++){
		System.out.println(this.items[i]);
	}

}	
	
}

 