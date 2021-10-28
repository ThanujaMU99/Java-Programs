class Mobile{

public ApplicationDTO[] application;
private int index;

public Mobile(int size){
application = new ApplicationDTO[size];
}
public boolean addMobileApplicationDetails(ApplicationDTO application){
	boolean mobileAdded=false;
	System.out.println("inside createPatient()");
	if(application != null){
		this.application[index++]=application;
	mobileAdded=true;
		
	}
	else{
		System.out.println("No Patient added");
	}
	
	return mobileAdded;
}

public void getAllMobileApplication(){
	for(int i=0;i<application.length;i++){
		System.out.println(application[i]);
	}
	
}



public boolean createMobileApplicationDetails(ApplicationDTO application){
boolean mobile = false;
if(application != null){
for(int i=0;i<application.length;i++){
	if(application!=null){
	this.application[index++]=application;
	mobile = true;
	}	
}
return mobile;
}
}

public boolean updateMobileApplicationId(String name,String applicationId){
	boolean updateMobile = false;
	for(int i=0;i<application.length;i++){
		if(application[i].getApplicationId().equals(applicationId)){
			System.out.println("price is updated");
			application[i].setApplicationId(applicationId);
			updateMobile=true;
		}
		else{
			System.out.println("price is not updated");
		}
		
	}

	return updateMobile;
}

public boolean deleteMobileByApplicationId(String applicationId){
	boolean deleteMobile= false;
	System.out.println("deleting the mobile by price");
	for(int i=0;i<application.length;i++){
		if(application[i].getApplicationId().equals(applicationId)){
			application[i].setApplicationId(applicationId);
				deleteMobile= true;
			
		}
		else{
			System.out.println("Mobile price is not found");
		}
	}
return deleteMobile;


}



}



