class ShirtTester{

public static void main(String a[]){


Shirt shirt = new Shirt();
shirt.setColor("white");
shirt.setSize(35);


Button button = new Button();
button.size="small";
button.color="blue";

shirt.setButtons(button);
System.out.println(shirt);

}



}