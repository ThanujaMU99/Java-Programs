public class CivilServicesDTO{


public CivilServicesDTO(){

System.out.println("Object is created");
}

private String name;
private int yearStarted;
private int fees;


public String getName(){

return name;
}
public void setName(String name){

this.name=name;
}
public int getYearStarted(){

return yearStarted;
}

public void setYearStarted(int yearStarted){

this.yearStarted=yearStarted;
}

public int getFees(){
return fees;
}

public void setFees(int fees){
this.fees=fees;

}

@Override
public String toString(){

return " CivilServicesDTO-[name="+this.name+",yearStarted="+this.yearStarted+",fees="+this.fees+"]";
}
}