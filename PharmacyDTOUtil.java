class PharmacyDTOUtil{

public static void main(String a[]){

PharmacyDTO dto = new PharmacyDTO();

dto.setPharmacyId(3456723l);
dto.setShopName("Apollo Pharmacy");
dto.setAddress("Bangalore");
dto.setOwnerName("Ranganath");

System.out.println(dto.getPharmacyId()+ " "+dto.getShopName()+" " +dto.getAddress()+" "+dto.getOwnerName());
}

}



