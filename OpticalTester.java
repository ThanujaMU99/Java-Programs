class OpticalTester{

public static void main(String a[]){

Optical specs= new Optical();

specs.name="Vincent chase";
specs.cost=999;
specs.color="Blue";

System.out.println(specs.name+" "+specs.cost+" "+specs.color);

specs.toSee();

Optical specs1= new Optical();

specs1.name="Jhon Jacobs";
specs1.cost=3000;
specs1.color="Black";

System.out.println(specs1.name+" "+specs1.cost+" "+specs1.color);

specs1.toSee();

Optical specs2= new Optical();

specs2.name="Peter Jones";
specs2.cost=1600;
specs2.color="White";

System.out.println(specs2.name+" "+specs2.cost+" "+specs2.color);

specs2.toSee();
}
}