class IceCreamTester{

public static void main(String a[]){

IceCream ice =new IceCream();
ice.name="Butterscotch";
ice.type="Cone";
ice.cost=30;

System.out.println(ice.name+" "+ice.type+" "+ice.cost);
ice.toEat();

IceCream ice1 =new IceCream();
ice1.name="Black Current";
ice1.type="Cone";
ice1.cost=30;

System.out.println(ice1.name+" "+ice1.type+" "+ice1.cost);
ice1.toEat();

IceCream ice2 =new IceCream();
ice2.name="Chocolate";
ice2.type="Cone";
ice2.cost=30;

System.out.println(ice2.name+" "+ice2.type+" "+ice2.cost);
ice2.toEat();
}
}