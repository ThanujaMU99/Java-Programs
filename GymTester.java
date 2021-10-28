import java.util.Scanner;

class GymTester{

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

Gym gym=new Gym(size);
for(int i=0;i<size;i++){
ComponentDTO dto=new  ComponentDTO();


System.out.println("enter the details");

System.out.println("enter the name");
String name=sc.next();

System.out.println("enter the cname");
String cname=sc.next();




dto.setCname(cname);
dto.setName(name);


boolean compadded=gym.creatGymDetails(dto);
System.out.println("comp added:");

}

gym.getAllGymDetails();

System.out.println("enter the updateGymComponents ");
System.out.println(gym.updateGymComponents(sc.next(),sc.next()));

System.out.println("enter the  deleteGymComponents");
System.out.println(gym.deleteGymComponents(sc.next()));


}
}