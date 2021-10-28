class Gym{

public ComponentDTO[] comp;
private int index;

public Gym(int size){

comp=new ComponentDTO[size];

}


public boolean creatGymDetails(ComponentDTO comp){

boolean compe=false;
System.out.println("inside ComponentDTO method");
if(comp!=null){
this.comp[index++]=comp;

compe=true;
}
else{
System.out.println("Component not created");

}

return compe;
}

public void getAllGymDetails(){
for(int i=0;i<comp.length;i++){

System.out.println(comp[i]);
}
}

public boolean updateGymComponents(String name,String Cname){
boolean update=false;
System.out.println("inside updateGymComponents method");
for(int i=0;i<comp.length;i++){

if(comp[i].getName().equals(Cname)){
comp[i].setName(name);
 update=true;
}
else{
System.out.println("not updated");
}
}
return update;
}

public boolean deleteGymComponents(String name){
boolean delete=false;
System.out.println("inside  deleteGymComponents method");
for(int i=0;i<comp.length;i++){
if(comp[i].getName().equals(name)){
comp[i]=null;
delete =true;


}
else{
	
	System.out.println("not deleted");
}


}
return delete;

}
}