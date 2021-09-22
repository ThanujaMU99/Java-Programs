class FlimUtil{

public static void main(String a[]){

FlimIndustry mv=new FlimIndustry();

mv.nameOfActor="Dr. Rajkumar";
mv.nameOfProducers="Rajendra Singh Babu";
mv.costForMovie=45000l;

System.out.println(mv.nameOfActor+" "+mv.nameOfProducers+" "+mv.costForMovie);

mv.movie();
FlimIndustry mv1=new FlimIndustry();

mv1.nameOfActor="Aditya";
mv1.nameOfProducers=" Babu";
mv1.costForMovie=4500l;

System.out.println(mv1.nameOfActor+" "+mv1.nameOfProducers+" "+mv1.costForMovie);

mv1.movie();

FlimIndustry mv2=new FlimIndustry();

mv2.nameOfActor="Swargachitra Appachan";
mv2.nameOfProducers="Apthamitra ";
mv2.costForMovie=48000l;

System.out.println(mv2.nameOfActor+" "+mv2.nameOfProducers+" "+mv2.costForMovie);

mv2.movie();

}


}