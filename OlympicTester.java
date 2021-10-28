import java.util.*;
class OlympicTester{

public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size");
	int size = sc.nextInt();

Olympic game = new Olympic(size);
for(int i=0;i<size;i++){


	GameDTO dto = new GameDTO(); 
	
	
	System.out.println("enter the OlympicGame name");
	String gameName = sc.next();
	System.out.println("enter the number of players");
	int  players = sc.nextInt();
	
	dto.setGameName(gameName);
	dto.setPlayers(players);
	
	


System.out.println("enter the UpdateOlympicGame details");
System.out.println(game.updateOlympicGameDetails(sc.next(),sc.nextInt()));
System.out.println("enter the delete OlympicGame details");
System.out.println(game.deleteOlympicGameDetails(sc.next()));


}




}


}

