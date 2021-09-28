class FancyStore{

String name;
String location;
String noOfItems[]={"jewellery","Gift Items","Toys ","Teddy Bear"};
int price;

public FancyStore(){
this("Balaji Fancy Store","Bangalore",1000);
System.out.println("FancyStore object is created");
}
public FancyStore(String name,String location,int price){
this.name=name;
this.location=location;
this.price=price;
}
public void displayDetails(){
System.out.println(this.name+" "+location+" "+price);
}
public void noOfItems(){
for(int i=0;i<this.noOfItems.length;i++){
System.out.println(this.noOfItems[i]);
}

}

}