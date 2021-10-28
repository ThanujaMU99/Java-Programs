public class  ContactsDTO{

public  ContactsDTO(){

System.out.println(" ContactsDTO object is created");

}

private String name;
private int contactNo;
private String aname;

public String getAname(){
	
	return aname;
}

public void setAname(String aname){
	this.aname=aname;
}

public String getName(){

return name;
}

public void setName(String name){

this.name=name;
}

public int getContactNo(){

return contactNo;
}

public void setContactNo(int contactNo){

this.contactNo=contactNo;
}
@Override
public String toString(){

return "ContactsDTO---[name="+this.name+",contactNo="+this.contactNo+"]";
}

}