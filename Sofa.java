class Sofa{
public String name;
public String color;
public int price;

public Sofa(String name,String color,int price){
System.out.println("Sofa Object is created");
this.name=name;
this.color=color;
this.price=price;

}
public static void main(String a[]){
Sofa name = new Sofa("wakefit","gray",5000);
System.out.println(name.name+" " +name.color+" " +name.price);
}

}