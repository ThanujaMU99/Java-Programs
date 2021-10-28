public  class  CastDTO{

public CastDTO(){

System.out.println("CastDTO object created");
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
return "CastDTO---[name="+this.name+",aname="+this.aname+"]";

}

}