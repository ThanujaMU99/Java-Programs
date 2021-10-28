class ApplicationDTO{

public ApplicationDTO(){

System.out.println(this.getClass().getSimpleName()+"Object is created");
}

private String name;
private String applicationId;

public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
public void setApplicationId(String applicationId){
this.applicationId=applicationId;
}
public String getApplicationId(){
return applicationId;
}
@Override
public String toString(){
return "ApplicationDTO----[name="+this.name+",applicationId="+this.applicationId+"]";
}


}