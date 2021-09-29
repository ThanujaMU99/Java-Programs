public class PatientDTO{

public PatientDTO(){
	
	System.out.println("PatientDTO object is created");
}

private long patientId;
private String patientName;
 private int age;
private String gender;
private String address;
private  String bloodGroup;


public long getPatientId(){
return patientId;
}

public void setPatientId(long patientId){
this.patientId=patientId;
}
public String getPatientName(){
return patientName;	
}
public int getAge(){
return age;
}
public String getGender(){
	return gender;
}
public String getAddress(){
	return address;
}
public String getBloodGroup(){
	return bloodGroup;
}
public void setPatientName(String patientName){
this.patientName=patientName;
}
public void setAge(int age){
	this.age=age;

}
public void setGender(String gender){
	this.gender=gender;
}
public void setAddress(String address){
	this.address=address;
}
public void setBloodGroup(String bloodGroup){
	this.bloodGroup=bloodGroup;
}

}