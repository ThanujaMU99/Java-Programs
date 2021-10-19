class Shirt{

public String color;
public int size;
public Button buttons;


public Shirt(){
System.out.println(this.getClass().getSimpleName()+"Object is created");
}

public void setColor(String color){
this.color=color;
}
public void setSize(int size){
this.size=size;
}
public void setButtons(Button buttons){
this.buttons=buttons;

}
@Override

public String toString(){
	return "Shirt-[color="+this.color+",size="+this.size+",buttons="+this.buttons+"]";

}



}