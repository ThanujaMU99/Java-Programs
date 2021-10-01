class PropertyDTOUtil{

public static void main(String a[]){

PropertyDTO dto = new PropertyDTO();
dto.setPropertyId(2456847l);
dto.setOwnerName("Bhoomi");
dto.setProperty("12sq-ft");
dto.setLocation("Bangalore");

System.out.println(dto.getPropertyId()+" "+dto.getOwnerName()+ " "+dto.getProperty()+" " +dto.getLocation());

}


}