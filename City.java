class   City{


public String name;
public String famousFor;
public int noOfTraningInstitute;


public void City(String nm,String ff,int it){

System.out.println("City object is created");

name=nm;
famousFor=ff;
noOfTraningInstitute=it;


}

public void rounds(){

System.out.println("nice to visit");
}

public void displayDetails(){

System.out.println(name+" "+famousFor+" "+noOfTraningInstitute);

}


}