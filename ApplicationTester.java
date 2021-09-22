class ApplicationTester{

public static void main(String a[]){

Application app= new Application();
app.name="FlipKart";
app.type="Enterprise";
app.storageInMb=18;

System.out.println(app.name+" "+app.type+" "+app.storageInMb);
app.browser();

Application app1= new Application();
app1.name="Powerpoint";
app1.type="Presentation";
app1.storageInMb=62;

System.out.println(app1.name+" "+app1.type+" "+app1.storageInMb);
app1.browser();


Application app2= new Application();
app2.name="Instagram";
app2.type="Entertainment";
app2.storageInMb=33;

System.out.println(app2.name+" "+app2.type+" "+app2.storageInMb);
app2.browser();

}
}