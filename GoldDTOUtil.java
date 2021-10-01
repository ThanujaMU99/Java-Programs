class GoldDTOUtil{

public static void main(String a[]){

GoldDTO dto = new GoldDTO();
dto.setGoldId(100);
dto.setName("24 Karat Gold");
dto.setPrice(4856);
dto.setColor("Pure Yellow");

System.out.println(dto.getGoldId()+" "+dto.getName()+" "+dto.getPrice()+" "+dto.getColor());
}
}