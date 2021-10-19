class HardDisk{

public int typesOfHardDisk;
public String nameOfHardDisk;
public String storage;
public int price;
public Data datas;

public HardDisk(){
	System.out.println(this.getClass().getSimpleName()+"Object is created");
}
public void setTypesOfHardDisk(int typesOfHardDisk){
this.typesOfHardDisk=typesOfHardDisk;
}
public void setNameOfHardDisk(String nameOfHardDisk){
this.nameOfHardDisk=nameOfHardDisk;
}
public void setPrice(int price){
this.price=price;
}
public void setStorage(String storage){
this.storage=storage;
}
public void setDatas(Data datas){
this.datas=datas;
}
@Override
public String toString(){
return "HardDisk-[typesOfHardDisk="+this.typesOfHardDisk+",nameOfHardDisk="+this.nameOfHardDisk+",storage="+this.storage+",price="+this.price+",datas="+this.datas+"]";
}

}