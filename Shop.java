class Shop{

public ElectronicsGadGetsDTO[] electronicsGad;

private int index;

public Shop(int size){
	electronicsGad = new ElectronicsGadGetsDTO[size];
}
public boolean addElectronicsGadDetails(ElectronicsGadGetsDTO electronicsGad){
	boolean added=false;
	System.out.println("inside createElectronicsGadDetails()");
	if(electronicsGad!= null){
		this.electronicsGad[index++]=electronicsGad;
			added=true;	
	}
	else{
		System.out.println("No ElectronicsGad added");
	
	}
	
	return added;
}

public void getAllElectronicsGad(){
	for(int i=0;i<electronicsGad.length;i++){
		System.out.println(electronicsGad[i]);
	}
	
}

public ElectronicsGadGetsDTO getElectronicsGadName(String electronicsGadName){
	ElectronicsGadGetsDTO dto= null;
	System.out.println("inside getElecronicsGadName()");
	if(electronicsGadName!=null){
		for(int i=0;i<electronicsGad.length;i++){
			if(electronicsGad[i].getElectronicsGadName().equals(electronicsGadName)){
			System.out.println("electronicsGad found by name:" +electronicsGadName);
			dto =  electronicsGad[i];
			}
		}
	}
		else{
			System.out.println("no electronicsGad found:" +electronicsGadName);
		}
		return dto;
}

public ElectronicsGadGetsDTO getBrand(String brand){
	ElectronicsGadGetsDTO dto = null;
	System.out.println("inside getBrand()");
	if(brand!=null){
		for(int i=0;i<electronicsGad.length;i++){
			if(electronicsGad[i].getBrand().equals(brand)){
			System.out.println("electronicsGad found by name:" +brand);
			dto =  electronicsGad[i];
			}
		}
	}
		else{
			System.out.println("no brand found:" +brand);
		}
		return dto;
}
public boolean updateElectronicsGadGetsByBrand(String electronicsGadName,String brand){
	boolean updateElectronicsGadGetsByBrand = false;
	for(int i=0;i<electronicsGad.length;i++){
		if(electronicsGad[i].getBrand().equals (brand)){
			System.out.println("brand is updated");
			electronicsGad[i].setBrand(brand);
			updateElectronicsGadGetsByBrand=true;
		}
		else{
			System.out.println("brand is not updated");
		}
		
	}

	return updateElectronicsGadGetsByBrand;
}

public boolean deleteElectronicsBrand(String brand ){
	boolean deleteElectronicsBrand= false;
	System.out.println("Electronics brand created");
	for(int i=0;i<electronicsGad.length;i++){
		if(electronicsGad[i].getBrand().equals(brand)){
			electronicsGad[i]=null;
				deleteElectronicsBrand= true;
			
		}
		else{
			System.out.println("Electronics brand not found");
		}
	}
return deleteElectronicsBrand;


}


}

