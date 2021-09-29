public class DominosDTO{

public DominosDTO(){

System.out.println("DominosDTO object is created");
}

private long dominosId;
private String name;
private String address;
private int cost;

public long getDominosId(){
return dominosId;	
}
public void setDominosId(long dominosId){
this.dominosId=dominosId;
}
public String getName(){
return name;
} 
public void setName(String name){
this.name=name;
}
public String getAddress(){
return address;
} 
public void setAddress(String address){
this.address=address;
}
public int getCost(){
return cost;
} 
public void setCost(int cost){
this.cost=cost;
}

}