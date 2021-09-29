class DominosDTOUtil{

public static void main(String a[]){

DominosDTO dto = new DominosDTO();
dto.setDominosId(8653976l);
dto.setName("Veg Pizza");
dto.setAddress("Rajajinagar");
dto.setCost(199);

System.out.println(dto.getDominosId()+" "+dto.getName()+" "+dto.getAddress()+ " "+dto.getCost());


}

}


