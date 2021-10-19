public class GodDTO{

public GodDTO(){
	System.out.println("GodDTO object is created");

}
private String name;
private String location;
private int noOfVisiters;

public String getName(){
	return name;
}
public void setName(String name){
this.name=name;
}
public String getLocation(){
return location;
}

public void setLocation(String location){
this.location=location;
}
public int getNoOfVisiters(){
return noOfVisiters;
}
public void setNoOfVisiters(int noOfVisiters){
this.noOfVisiters=noOfVisiters;
}
@Override
public String toString(){
return "GodDTo-[name="+this.name+",location="+this.location+",noOfVisiters="+this.noOfVisiters+"]";
}

}