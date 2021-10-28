import java.util.Scanner;
class CityTester{

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

City city=new City(size);
for(int i=0;i<size;i++){
CompanyDTO dto=new CompanyDTO();

System.out.println("enter the company details");

System.out.println("enter the name");
String name=sc.next();

System.out.println("enter the Employee name");
String ename=sc.next();

System.out.println("enter the patient address");
String address=sc.next();

dto.setName(name);
dto.setEname(ename);
dto.setAddress(address);

boolean companyadded=city.creatCompanyDetails(dto);
System.out.println("company added:");

}

city.getAllCompanyDetails();

System.out.println("enter the updateCompanyByemployeeName ");
System.out.println(city. updateCompanyByemployeeName(sc.next(),sc.next()));

System.out.println("enter the  deleteCompany");
System.out.println(city. deleteCompany(sc.next()));


}


}