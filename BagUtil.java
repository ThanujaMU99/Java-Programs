class BagUtil{

public static void main(String a[]){

Bags bag=new Bags();

bag.name="handbag";
bag.cost=300;
bag.brand="Da Milano";

System.out.println(bag.name+" "+bag.cost+" "+bag.brand);

bag.carry();

Bags bag1=new Bags();

bag1.name="School bags";
bag1.cost=500;
bag1.brand="Baggit";

System.out.println(bag1.name+" "+bag1.cost+" "+bag1.brand);

bag1.carry();


Bags bag2=new Bags();

bag2.name="lunchbags";
bag2.cost=300;
bag2.brand="leather";

System.out.println(bag2.name+" "+bag2.cost+" "+bag2.brand);

bag2.carry();


}

}