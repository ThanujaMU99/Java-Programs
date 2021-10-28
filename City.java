class City{

public CompanyDTO[] company;
private int index;

public City(int size){

company=new CompanyDTO[size];

}

public boolean creatCompanyDetails(CompanyDTO company){

boolean company1=false;
System.out.println("inside creatCompanyDetails method");
if(company!=null){
this.company[index++]=company;

company1=true;
}
else{
System.out.println("company not created");

}

return company1;
}

public void getAllCompanyDetails(){
for(int i=0;i<company.length;i++){

System.out.println(company[i]);
}
}

public boolean updateCompanyByemployeeName(String ename,String name){
boolean update=false;
System.out.println("inside updateCompanyByemployeeName method");
for(int i=0;i<company.length;i++){

if(company[i].getName().equals(ename)){
company[i].setName(name);
 update=true;
}
else{
System.out.println("not updated");
}
}
return update;
}


public boolean deleteCompany(String name){
boolean delete=false;
System.out.println("inside deleteCompany method");
for(int i=0;i<company.length;i++){
if(company[i].getName().equals(name)){
company[i]=null;
delete =true;


}
else{
	
	System.out.println("not deleted");
}


}
return delete;

}
}



