public class PharmacyDTO{

public PharmacyDTO(){
System.out.println("pharmacyDTO object is created");
}
private long pharmacyId;
private String shopName;
private String address;
private String ownerName;

public long getPharmacyId(){
return pharmacyId;
}
public void setPharmacyId(long pharmacyId){
this.pharmacyId=pharmacyId;
}
public String getShopName(){
return shopName;
}
public void setShopName(String shopname){
this.shopName=shopName;
}
public String getAddress(){
return address;
}
public void setAddress(String address){
this.address=address;
}
public String getOwnerName(){
return ownerName;
}
public void setOwnerName(String ownerName){
this.ownerName=ownerName;
}



}