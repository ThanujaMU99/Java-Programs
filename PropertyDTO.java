public class PropertyDTO{

public PropertyDTO(){
System.out.println("PropertyDTO object is created");
}
private long propertyId;
private String ownerName;
private String property;
private String location;

public long getPropertyId(){
return propertyId;
} 
public void setPropertyId(long propertyId){
this.propertyId=propertyId;
}
public String getOwnerName(){
return ownerName;
} 
public void setOwnerName(String ownerName){
this.ownerName=ownerName;
}
public  String getProperty(){
return property;
} 
public void setProperty(String property){
this.property=property;
}
public String getLocation(){
return location;
} 
public void setLocation(String location){
this.location=location;
}

}