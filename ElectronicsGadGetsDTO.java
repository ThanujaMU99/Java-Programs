class ElectronicsGadGetsDTO{

public ElectronicsGadGetsDTO(){

System.out.println(this.getClass().getSimpleName()+"Object is created");

}

private  String electronicsGadName;
private String brand;


public void setElectronicsGadName(String electronicsGadName){
this.electronicsGadName=electronicsGadName;
}
public String getElectronicsGadName(){
return electronicsGadName;
}
public void setBrand(String brand){
this.brand=brand;
}
public String getBrand(){
return brand;
}

@Override
public String toString(){
	return "ElectronicsGadGetsDTO---[electronicsGadName="+this.electronicsGadName+",brand="+this.brand+"]";	
}

}



