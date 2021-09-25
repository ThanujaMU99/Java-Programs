class Exam1{

public String universityName;
public int fees;

public Exam1(String name,int fs){
System.out.println("Exam object is created");
universityName=name;
fees = fs;
}
public static void main(String a[]){
Exam1 exam = new Exam1("vtu",1324);
System.out.println(exam.universityName+" " +exam.fees);
}
}