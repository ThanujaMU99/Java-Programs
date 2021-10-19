public class JobDTO{

public JobDTO(){

System.out.println("JobDTO object is created");
}

private String name;
private int noOfVaccencies;
private String location;

public String getName(){

return name;
}

public void setName(String name){

this.name=name;
}

public int getNoOfVaccencies(){

return noOfVaccencies;
}
public void setNoOfVaccencies(int noOfVaccencies){
this.noOfVaccencies=noOfVaccencies;
}
public String getLocation(){
return location;
}
public void setLocation(String location){
this.location=location;
}
@Override
public String toString(){
return "JobDTO -[name="+this.name+",noOfVaccencies="+this.noOfVaccencies+",location="+this.location+"]";
}
}