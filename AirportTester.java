class AirportTester{

public static void main(String a[]){

Airport airport = new Airport();
airport.setAirportId(342);
airport.setAirportName("KIA");
airport.setLocation("near Devannahalli");


Terminal terminal = new Terminal();
terminal.terminalId = 89;
terminal.name="Terminal-1";

//Airport has Terminal
airport.setTerminals(terminal);
System.out.println(airport);

}


}