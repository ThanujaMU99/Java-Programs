class DrivingLicenseDTO{

public DrivingLicenseDTO(){
System.out.println("DrivingLicenseDTO object is created");
}

private Long drivingLicenseId;
private String name;
private String address;
private int amount;

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
public int getAmount(){
return amount;
} 
public void setAmount(int amount){
this.amount=amount;
}
@Override
public String toString(){
	return "drivingLicenseDTO-[drivingLicenseId="+this.drivingLicenseId+",name="+this.name+",address="+this.address+",amount="+this.amount+"]";
}
@Override
public int hashCode(){
	return amount;
	
}

}
