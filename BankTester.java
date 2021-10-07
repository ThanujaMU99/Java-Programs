class BankTester{

public static void main(String a[]){

Bank bank = new BandhanBank();
bank.provideLoans(7.5);
System.out.println(bank);

Bank dto = new SbiBank();
dto.provideLoans(7.1);
System.out.println(dto);

Bank name = new CanaraBank();
name.provideLoans(4.9);
System.out.println(name);

Bank bk = new AxisBank();
bk.provideLoans(5.8);
System.out.println(bk);

Bank amount = new HDFCBank();
amount.provideLoans(7.9);
System.out.println(amount);

Bank add = new ICICIBank();
add.provideLoans(7.9);
System.out.println(add);



}




}