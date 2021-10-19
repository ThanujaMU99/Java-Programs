class Book{

public String name;
public int cost;
public Pages page;

public Book(){
System.out.println(this.getClass().getSimpleName()+"Object is created");
}
public void setName(String name){
this.name=name;
}
public void setCost(int cost){
this.cost=cost;
}
public void setPage(Pages page){
this.page=page;
}
@Override
public String toString(){
return "Book-[name="+this.name+",cost="+this.cost+",page="+this.page+"]";
}

}