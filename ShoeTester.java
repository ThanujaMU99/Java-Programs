class ShoeTester{

public static void main(String a[]){

Shoe shoe=new Shoe();

shoe.cost=1340;
shoe.brand=" Bata";

System.out.println(shoe.cost+" "+shoe.brand);
shoe.run();


Shoe shoe1=new Shoe();

shoe1.cost=2000;
shoe1.brand="Paragon";

System.out.println(shoe1.cost+" "+shoe1.brand);
shoe1.run();


Shoe shoe2=new Shoe();

shoe2.cost=700;
shoe2.brand="Timberland";

System.out.println(shoe2.cost+" "+shoe2.brand);
shoe2.run();

}
}