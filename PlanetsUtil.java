class PlanetsUtil{

public static void main(String a[]){

Planets pt = new Planets("Earth","Spherical",1);

pt.toRotate();
pt.displayDetails();



Planets pt1 = new Planets("Mars","Spherical",2);

pt1.toRotate();
pt1.displayDetails();

Planets pt2 = new Planets("Jupiter","Spherical",67);

pt2.toRotate();
pt2.displayDetails();

}
}