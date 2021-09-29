class LibraryDTOUtil{

public static void main(String a[]){

LibraryDTO dto = new LibraryDTO();
dto.setLibraryId(2345l);
dto.setName("JRD Tata Memorial");
dto.setLocation("Bangalore");

System.out.println(dto.getLibraryId()+" "+dto.getName()+" "+dto.getLocation());


}


}