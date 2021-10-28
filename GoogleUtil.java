import java.util.Scanner;

class GoogleUtil{

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

Google google=new Google(size);
for(int i=0;i<size;i++){
GoogleApplicationDTO dto=new  GoogleApplicationDTO();

System.out.println("enter the googlrapplication details");

System.out.println("enter the name");
String name=sc.next();

System.out.println("enter the Employee Application name");
String aname=sc.next();



dto.setName(name);
dto.setAname(aname);

boolean applicationadded=google.creatGoogleApplicationDetails(dto);
System.out.println("application added:");

}

google.getAllgoogleapplicationDetails();

System.out.println("enter the updateGooglebyApplication ");
System.out.println(google.updateGooglebyApplication(sc.next(),sc.next()));

System.out.println("enter the  deletegoogleapplication");
System.out.println(google.deletegoogleapplication(sc.next()));



}

}