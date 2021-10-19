class HardDiskTester{

public static void main(String a[]){

HardDisk disk = new HardDisk();
disk.setTypesOfHardDisk(4);
disk.setNameOfHardDisk("SSD");
disk.setPrice(2400);
disk.setStorage("1 Tb");





Data data = new Data();
data.purpose="Store data typically";
disk.setDatas(data);
System.out.println(disk);

}



}