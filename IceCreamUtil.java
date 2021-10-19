class IceCreamUtil{

public static void main(String a[]){

IceCreamDTO ice=new IceCreamDTO();

ice.setName("Butterscroch");
ice.setCost(45);
ice.setFlavor("chocolate");

System.out.println(ice);



IceCreamDTO ice1=new IceCreamDTO();

ice1.setName("GudBud");
ice1.setCost(40);
ice1.setFlavor("chocolate");

System.out.println(ice1);

IceCreamDTO ice2=new IceCreamDTO();

ice2.setName("Familypack");
ice2.setCost(250);
ice2.setFlavor("venila");

System.out.println(ice2);

}

}