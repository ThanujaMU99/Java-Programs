public class AccountDTO{


public AccountDTO(){

System.out.println("AccountDTO object is created");

}
private int number;
private int age;
private String bankName;


public int getNumber(){

return number;
}
public void setNumber(int number){

this.number=number;
}

public int getAge(){

return age;
}
public void setAge(int age){

this.age=age;
}

public String getBankName(){
return bankName;
}
public void setBankName(String bankName){
this.bankName=bankName;
}

@Override 
public String toString(){

return " AccountDTO---[AccountNumber="+this.number+",age="+this.age+",bankName="+this.bankName+"]";
}
}