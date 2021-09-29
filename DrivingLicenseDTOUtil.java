class DrivingLicenseDTOUtil{

public static void main(String a[]){

DrivingLicenseDTO dto = new DrivingLicenseDTO();
dto.setDrivingLicenseId(234562l);
dto.setName("Baba");
dto.setAddress("Bangalore");
dto.setPhoto(2);

System.out.println(dto.getDrivingLicenseId()+" "+dto.getName()+" "+dto.getAddress()+ " " +dto.getPhoto());


}

}