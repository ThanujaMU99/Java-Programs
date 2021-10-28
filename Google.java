class  Google{

public GoogleApplicationDTO[] google;
private int index;

public Google(int size){

google=new GoogleApplicationDTO[size];

}

public boolean creatGoogleApplicationDetails(GoogleApplicationDTO google){

boolean google1=false;
System.out.println("inside  GoogelApplicationDTO method");
if(google!=null){
this.google[index++]=google;

google1=true;
}
else{
System.out.println(" GoogelApplication not created");

}

return google1;
}


public void getAllgoogleapplicationDetails(){
for(int i=0;i<google.length;i++){

System.out.println(google[i]);
}
}

public boolean updateGooglebyApplication(String Aname,String name){
boolean update=false;
System.out.println("inside updateGooglebyApplication method");
for(int i=0;i<google.length;i++){

if(google[i].getName().equals(Aname)){
google[i].setName(name);
 update=true;
}
else{
System.out.println("not updated");
}
}
return update;
}

public boolean deletegoogleapplication(String name){
boolean delete=false;
System.out.println("inside deletegoogleapplication method");
for(int i=0;i<google.length;i++){
if(google[i].getName().equals(name)){
google[i]=null;
delete =true;


}
else{
	
	System.out.println("not deleted");
}


}
return delete;

}
}


