class PatientDTOUtil{

public static void main(String a[]){

PatientDTO dto = new PatientDTO();
dto.setPatientId(123454890l);
dto.setPatientName("ABC");
dto.setAge(27);
dto.setGender("male");
dto.setAddress("Nagarbavi");
dto.setBloodGroup("B+");
System.out.println(dto.getPatientId()+" "+dto.getPatientName()+ " "+dto.getAge()+ " "+dto.getGender()+ " "+dto.getAddress()+" " +dto.getBloodGroup());
}


}