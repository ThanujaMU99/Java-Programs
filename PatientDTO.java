public class PatientDTO{


public PatientDTO(){

System.out.println(this.getClass().getSimpleName()+"Object is created");

}

private  int patientId;
private String patientName;
private String address;
private int age;


public void setPatientId(int patientId){
this.patientId=patientId;
}
public int getPatientId(){
return patientId;
}
public void setPatientName(String patientName){
this.patientName=patientName;
}
public String getPatientName(){
return patientName;
}

public void setAddress(String address){
this.address=address;
}
public String getAddress(){
return address;
}

public void setAge(int age){
this.age=age;
}
public int getAge(){
return age;
}

@Override
public String toString(){
	return "patientDTO----[patientId ="+this.patientId+",patientName="+this.patientName+",address="+this.address+",age="+this.age+"]";	
}

}