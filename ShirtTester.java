class ShirtTester{


public static void main(String a[]){


Shirt shirt=new Shirt();

shirt.name="Oxford Cloth Button-Down Shirt";
shirt.cost=250;
shirt.color="black";

System.out.println(shirt.name+" "+shirt.cost+" "+shirt.color);
shirt.look();

Shirt shirt1=new Shirt();

shirt1.name=" Flannel Shirt";
shirt1.cost=750;
shirt1.color="blue";

System.out.println(shirt1.name+" "+shirt1.cost+" "+shirt1.color);
shirt1.look();


Shirt shirt2=new Shirt();

shirt2.name="Dress Shirt";
shirt2.cost=550;
shirt2.color="red";

System.out.println(shirt2.name+" "+shirt2.cost+" "+shirt2.color);
shirt2.look();

}


}