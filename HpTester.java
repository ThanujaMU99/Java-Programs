class HpTester{
	public static void main(String a[]){
	
	Hp hp = new Hp();
	hp.price=45000.00;
	hp.storage="500GB";
	hp.processor="Intel Core i3";
	hp.modelNo="G61-429WM";
	hp.displayDetails();
	String store=hp.store();
	System.out.println(store);
	
	}

}