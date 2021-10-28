import java.util.Scanner;
class MobileTester{

public static void main(String a[]){

Scanner sc = new Scanner(System.in);
int size = sc.nextInt();

Mobile mobile = new Mobile(size);

for(int i=0;i<size;i++){

ApplicationDTO  dto = new ApplicationDTO();

	System.out.println("enter the MobileName");
	String name = sc.next();
	System.out.println("enter the Price");
	String applicationId = sc.next();
	
	
	dto.setName(name);
	dto.setApplicationId(applicationId);
	boolean isAdded=mobile.createMobileApplicationDetails((dto));
System.out.println("application is added:"+isAdded);

System.out.println("enter the updateMobilePricedetails");
System.out.println(mobile.updateMobileApplicationId(sc.next(),sc.next()));
System.out.println("enter the deleteMobilePrice details");
System.out.println(mobile.deleteMobileByApplicationId(sc.next()));
	
}


}



}