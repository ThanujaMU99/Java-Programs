class Cylinder{
public String name;
public String color;
public int price;

public Cylinder(String name,String color,int price){
System.out.println("cylinder object is created");
this.name=name;
this.color=color;
this.price=price;
}
public static void main(String a[]){

Cylinder gas = new Cylinder("Indian","Red",950);
System.out.println(gas.name+ " " +gas.color+" " +gas.price);
}


}