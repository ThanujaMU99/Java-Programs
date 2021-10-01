public class GoldDTO{

public GoldDTO(){

System.out.println("GoldDTO object is created");
}

private int goldId;
private String name;
private int price;
private String color;

public int getGoldId(){
return goldId;	
}
public void setGoldId(int goldId){
this.goldId=goldId;
}
public String getName(){
return name;	
}
public void setName(String name){
this.name=name;
}
public int getPrice(){
return price;	
}
public void setPrice(int price){
this.price=price;
}
public String getColor(){
return color;	
}
public void setColor(String color){
this.color=color;
}



}