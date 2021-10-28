class Bank{

public AccountDTO[] account;
private int index;

public Bank(int size){

account=new AccountDTO[size];

}

public boolean creatAccountsDetails(AccountDTO account){

boolean accountCreated=false;
System.out.println("inside  creatAccountsDetails method");
if(account!=null){
this.account[index++]=account;

accountCreated=true;
}
else{
System.out.println("account not created");

}

return accountCreated;
}

public void getAllAccounts(){
for(int i=0;i<account.length;i++){

System.out.println(account[i]);
}
}

public boolean updateAccountNumberbyAge(int age,int number){
boolean update=false;
System.out.println("inside updateAccountNumberbyAge method");
for(int i=0;i<account.length;i++){

if(account[i].getAge()==age){
account[i].setNumber(number);
 update=true;
}
else{
System.out.println("not updated");
}
}
return update;
}

public boolean deleteAccount(int number){
boolean delete=false;
System.out.println("inside deleteAccount method");
for(int i=0;i<account.length;i++){
if(account[i].getNumber()==number){
account[i]=null;
delete =true;


}
else{
	
	System.out.println("not deleted");
}


}
return delete;

}
}