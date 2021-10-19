public class StatesDto{

public StatesDto(){

System.out.println("StatesDto object is created");

}

private String name;
private long population;
private int noOfStates;

public String getName(){

return name;
}
public void setName(String name){

this.name=name;
}

public long getPopulation(){

return population;
}
public void setPopulation(int population){

this.population=population;
}
public int getNoOfStates(){
return noOfStates;
}
public void setNoOfStates(int noOfStates){
this.noOfStates=noOfStates;
}
@Override
public String toString(){
return "StatesDto -[name="+this.name+",population="+this.population+",noOfStates="+this.noOfStates+"]";
}

}