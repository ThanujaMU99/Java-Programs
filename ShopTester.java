import java.util.*;
class ShopTester{

public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int size = sc.nextInt();

Shop shop  = new Shop(size);
for(int i=0;i<size;i++){


	ElectronicsGadGetsDTO dto = new ElectronicsGadGetsDTO(); 
	
	
	System.out.println("enter the ElectronicsGadName");
	String elecronicsGadName = sc.next();
	System.out.println("enter the brand");
	String brand = sc.next();
	
	dto.setElectronicsGadName(elecronicsGadName);
	dto.setBrand(brand);
	boolean isAdded=shop.addElectronicsGadDetails(dto);
System.out.println("ElectronicsGad is added:"+isAdded);
	

System.out.println(shop.getElectronicsGadName("Butterfly"));
System.out.println("enter the UpdateElectronicsGad details");
System.out.println(shop.updateElectronicsGadGetsByBrand(sc.next(),sc.next()));
System.out.println("enter the delete ElectronicsGad details");
System.out.println(shop.deleteElectronicsBrand(sc.next()));


}




}


}	