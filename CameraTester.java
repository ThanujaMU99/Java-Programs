class CameraTester{

public static void main(String a[]){

Camera cam= new Camera();
cam.brand="Nikon";
cam.brandColor="Black";
cam.price=35999;

System.out.println(cam.brand+" "+cam.brandColor+" "+cam.price);
cam.capture();


Camera cam1= new Camera();
cam1.brand="Canon";
cam1.brandColor="Black";
cam1.price=41999;

System.out.println(cam1.brand+" "+cam1.brandColor+" "+cam1.price);
cam1.capture();

Camera cam2= new Camera();
cam2.brand="Sony";
cam2.brandColor="Blue";
cam2.price=53990;

System.out.println(cam2.brand+" "+cam2.brandColor+" "+cam2.price);
cam2.capture();

}
}