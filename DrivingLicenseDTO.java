class DrivingLicenseDTO{

public DrivingLicenseDTO(){
System.out.println("DrivingLicenseDTO object is created");
}

private Long drivingLicenseId;
private String name;
private String address;
private int photo;

public long getDrivingLicenseId(){
return drivingLicenseId;
} 
public void setDrivingLicenseId(long drivingLicenseId){
this.drivingLicenseId=drivingLicenseId;
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
public int getPhoto(){
return photo;
} 
public void setPhoto(int photo){
this.photo=photo;
}

}
