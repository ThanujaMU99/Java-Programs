class GoogleApplicationDTO{


public GoogleApplicationDTO(){


System.out.println("GoogelApplicationDTO object is created");
}

private String name;
private String aname;

public String getName(){

return name;
}
public void setName(String name){
this.name=name;
}
public String getAname(){

return aname;
}

public void setAname(String aname){

this.aname=aname;
}

@Override
public String toString(){

return "GoogelApplicationDTO---[name="+this.name+",Applicationname="+this.aname+"]";

}
}