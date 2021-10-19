public class IceCreamDTO{

public IceCreamDTO(){

System.out.println("IceCreamDTO object is created");

}


private String name;
private int cost;
private String flavor;

public String getName(){

 return name;

}

public void setName(String name){

this.name=name;
}

public int getCost(){

return cost;
}

public void setCost(int cost){

this.cost=cost;
}
public String getFlavor(){
return flavor;
}
public void setFlavor(String flavor){
this.flavor=flavor;
}

@Override
public String toString(){
return "IceCreamDTO-[name="+this.name+",cost="+this.cost+",flavor="+this.flavor+"]";

}
}