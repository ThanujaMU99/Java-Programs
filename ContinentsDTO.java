public class ContinentsDTO{

public ContinentsDTO(){

System.out.println("ContinentsDto object is created");
}

private String largestContinent;
private String smallestContinent;
private int noOfContinents;

public String getLargestContinent(){
return largestContinent;
}
public void setLargestContinent(String largestContinent){
 this.largestContinent=largestContinent;
}
public String getSmallestContinent(){
return smallestContinent;
}
public void setSmallestContinent(String smallestContinent){
this.smallestContinent=smallestContinent;
}
public int getNoOfContinents(){
return noOfContinents;
}
public void setNoOfContinents(int noOfContinents){
this.noOfContinents=noOfContinents;
}
@Override
public String toString(){
return "ContinentsDto-[largestContinent="+this.largestContinent+",smallestContinent="+this.smallestContinent+",noOfContinents="+this.noOfContinents+"]";
}

}