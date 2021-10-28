import java.util.*;
class HospitalTester{

public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int size = sc.nextInt();

Hospital hospital = new Hospital(size);
for(int i=0;i<size;i++){
	
	PatientDTO dto = new PatientDTO(); 
	
	System.out.println("enter the patient Details");
	
	System.out.println("enter patient Id");
	int patientId = sc.nextInt();
	
	System.out.println("enter the PatientName");
	String patientName = sc.next();
	
	System.out.println("enter the address");
	String address = sc.next();
	
	System.out.println("enter the age");
	int age = sc.nextInt();
	
	
	dto.setPatientId(patientId);
	dto.setPatientName(patientName);
	
	dto.setAddress(address);
	
	dto.setAge(age);
	
	boolean isAdded=hospital.addPatientDetails(dto);
System.out.println("patient added:"+isAdded);

}
hospital.getAllPatients();
System.out.println(hospital.getPatientByName("Rohit"));

System.out.println("enter the updatePatientAgeById ");
System.out.println(hospital.updatePatientAgeById(sc.nextInt(),sc.nextInt()));

System.out.println("enter the deletePatientById");
System.out.println(hospital.deletePatientById(sc.nextInt()));


}




}
	
	


//PatientDTO dto = new PatientDTO();
//dto.setPatientId(1);
//dto.setPatientName("Rohit");
//dto.setAddress("Rajajinagar");
//dto.setAge(45);
//dto.setGender("Male");
//dto.setBloodGroup("O +ve");
//dto.setContactNo(3257858);
//boolean isAdded1 = hospital.addPatientDetails(dto1);
//System.out.println(isAdded1);


