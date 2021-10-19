class CpuUtil{

public static void main(String a[]){


Cpu cpu=new Cpu();
cpu.setName("i3");
System.out.println(cpu);


Processor processor=new Processor();
processor.speedOfCpu="2.8 GHz CPU";

cpu.setProcessor(processor);
System.out.println(processor);


}


}