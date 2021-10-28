class Hospital{

public PatientDTO[] patients;

private int index;

public Hospital(int size){
	patients = new PatientDTO[size];
}
public boolean addPatientDetails(PatientDTO patients){
	boolean patientAdded=false;
	System.out.println("inside createPatient()");
	if(patients != null){
		this.patients[index++]=patients;
	patientAdded=true;
		
	}
	else{
		System.out.println("No Patient added");
		//return patientAdded=false;
	}
	
	return patientAdded;
}

public void getAllPatients(){
	for(int i=0;i<patients.length;i++){
		System.out.println(patients[i]);
	}
	
}
public PatientDTO getPatientByName(String patientName){
	PatientDTO patientDTO = null;
	System.out.println("inside getPatientByName()");
	if(patientName!=null){
		for(int i=0;i<patients.length;i++){
			if(patients[i].getPatientName().equals(patientName)){
			System.out.println("patient found by name:" +patientName);
			patientDTO= patients[i];
			}
		}
	}
		else{
			System.out.println("no patient found:" +patientName);
		}
		return patientDTO;
}

 public PatientDTO getPatientId(int patientId){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientId()");
	if(patientId!=0){
		for(int i=0;i<patients.length;i++){
			if(patients[i].getPatientId()==patientId){
				System.out.println("patient found by id:" +patientId);
				patientDTO=patients[i];
			}
		}
	}
	else{
		System.out.println("no patient id found :"+patientId);
	}
		return patientDTO;

}


public PatientDTO getPatientByAge(int age){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientId()");
	if(age!=0){
		for(int i=0;i<patients.length;i++){
			if(patients[i].getAge()==age){
				System.out.println("patient found by id:" +age);
				patientDTO=patients[i];
			}
		}
	}
	else{
		System.out.println("no patient id found :"+age);
	}
		return patientDTO;

}

public PatientDTO getAddress(String address){
	PatientDTO patientDTO = null;
	System.out.println("inside getPatientByName()");
	if(address!=null){
		for(int i=0;i<patients.length;i++){
			if(patients[i].getAddress().equals(address)){
			System.out.println("patient found by name:" +address);
			patientDTO= patients[i];
			}
		}
	}
		else{
			System.out.println("no patient found:" +address);
		}
		return patientDTO;
}
public boolean updatePatientAgeById(int age, int patientId){
	boolean updatePatientAgeById = false;
	for(int i=0;i<patients.length;i++){
		if(patients[i].getPatientId() == patientId){
			System.out.println("patient age is updated");
			patients[i].setAge(age);
			updatePatientAgeById=true;
		}
		else{
			System.out.println("patient age not updated");
		}
		
	}

	return updatePatientAgeById;
}
public boolean deletePatientById(int patientId){
	boolean deletePatientById = false;
	System.out.println("deletePatientById created");
	for(int i=0;i<patients.length;i++){
		if(patients[i].getPatientId()== patientId){
			patients[i]=null;
				deletePatientById = true;
			
		}
		else{
			System.out.println("deletePatientById not found");
		}
	}
return deletePatientById;


}
}