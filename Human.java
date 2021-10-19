class Human{
	
public Human(){
	
	System.out.println("Human object is created");
}

public String name;
public int age;
public Heart heart;
public void setName(String name){

this.name=name;

}

public void setAge(int age){

this.age=age;
}
public void setHeart(Heart heat){
	
	this.heart=heat;
}

@Override
public String toString(){

return "Human -[name="+this.name+",age="+this.age+",heart="+this.heart+"]";
}

}