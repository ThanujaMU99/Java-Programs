import java.util.Scanner;
class BankTester{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();

Bank bank=new Bank(size);
for(int i=0;i<size;i++){
AccountDTO dto=new AccountDTO();

System.out.println("enter the Account  details");

System.out.println("enter the Account number");
int number=sc.nextInt();

System.out.println("enter the bank name");
String bankName=sc.next();

System.out.println("enter the accountholdr age");
int age=sc.nextInt();

dto.setNumber(number);
dto.setBankName(bankName);
dto.setAge(age);

boolean  accountdetailsadded=bank.creatAccountsDetails(dto);
System.out.println("account added:");
}
bank. getAllAccounts();

System.out.println("enter the  updateAccountNumberbyAge");
System.out.println(bank. updateAccountNumberbyAge(sc.nextInt(),sc.nextInt()));

System.out.println("enter the deleteAccount");
System.out.println(bank.deleteAccount(sc.nextInt()));

}
}