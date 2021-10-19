class Cpu{

public String name;
public Processor processor;

public Cpu(){

System.out.println("Cpu object is created");
}

public void setName(String name){

this.name=name;
}

public void setProcessor(Processor processor){

this.processor=processor;
}

@Override
public String toString(){
return "Cpu -[name="+this.name+",processor="+this.processor+"]";

}
}