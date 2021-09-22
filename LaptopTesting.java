class LaptopTesting{

public static void main(String a[]){

	Laptop laptop = new Laptop();
	laptop.name = "HP";
	laptop.cost = 37000l;
	laptop.color = "black";
	laptop.operatingSystem = "Windows";
	laptop.memory = "1 TB";
	System.out.println(laptop.name+" "+laptop.cost+" "+laptop.color+" " +laptop.operatingSystem+ " "+laptop.memory);

	laptop.work();

	Laptop laptop1 = new Laptop();
	laptop1.name = "Dell";
	laptop1.cost = 50000l;
	laptop1.color = "white";
	laptop1.operatingSystem = "Windows 10";
	laptop1.memory = "2 TB";
	System.out.println(laptop1.name+" "+laptop1.cost+" "+laptop1.color+" " +laptop1.operatingSystem+ " "+laptop1.memory);

	laptop1.work();
	
	Laptop laptop2 = new Laptop();
	laptop2.name = "Lenovo";
	laptop2.cost = 31990l;;
	laptop2.color = "gray";
	laptop2.operatingSystem = "Windows";
	laptop2.memory = "3 TB";
	System.out.println(laptop2.name+" "+laptop2.cost+" "+laptop2.color+" " +laptop2.operatingSystem+ " "+laptop2.memory);

	laptop2.work();

}
}