class LicDTOUtil{

public static void main(String a[]){

LicDTO dto = new LicDTO();
dto.setPolicyId(32457689l);
dto.setCustomerName("Rama");
dto.setYears(5);

System.out.println(dto.getPolicyId()+" " +dto.getCustomerName()+" " +dto.getYears());


}


}