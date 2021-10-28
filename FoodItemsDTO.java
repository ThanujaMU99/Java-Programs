class FoodIteamsDTO{

public FoodIteamsDTO(){

System.out.println("FoodIteamsDTO object is created");

}
private String iteams;
private String name;
private int cost;

public String getIteams(){

return iteams;
}

public void setIteams(String iteams){

this.iteams=iteams;
}
public String getName(){

return name;
}
public void setName(String name){

this.name=name;
}
public  int getCost(){

return cost;
}
public void setCost(int cost){

this.cost=cost;
}

@Override 
public String toString(){

return " FoodIteamsDTO--[itams="+this.iteams+",name="+this.name+",cost="+this.cost+"]";
}

} 