class Folder{
	
public Folder(){
	
	System.out.println("Floder object is created");
}

public int size;
public Files files;

public void setSize(int size){

this.size=size;
}
@Override 
public String toString(){

return "Folder-[size="+this.size+",files="+this.files+"]";
}

}