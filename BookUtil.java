class BookUtil{

public static void main(String a[]){

Book book = new Book();
book.setName("Vidya");
book.setCost(4500);


//System.out.println(book);


Pages dto = new Pages();
dto.type="Ruld";
book.setPage(dto);
System.out.println(book);

}


}