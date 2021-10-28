public class ComponentDTO{


public ComponentDTO(){

System.out.println("ComponentDTO object is created");
}

private String name;
private String cname;


public String getName(){

return name;
}
public void setName(String name){
this.name=name;
}
public String getCname(){

return name;
}

public void setCname(String cname){

this.cname=cname;
}


@Override
public String toString(){

return "ComponentDTO---[name="+this.name+",cname="+this.cname+"]";

}
}