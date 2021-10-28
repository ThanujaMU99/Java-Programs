class Olympic{

public GameDTO[] game;
private int index;

public Olympic(int size){

game =  new GameDTO[size];

}

public boolean createOlympicGameDetails(GameDTO game){
	boolean added=false;
	System.out.println("inside createOlympicGameDetails()");
	if(game!= null){
		this.game[index++]=game;
			added=true;	
	}
	else{
		System.out.println("No OlympicGame added");
	
	}
	
	return added;
}

public void getAllOlympicgameDetails(){
	for(int i=0;i<game.length;i++){
		System.out.println(game[i]);
	}
	
}

public boolean updateOlympicGameDetails(String gameName,int players){
	boolean updateOlympicGame = false;
	for(int i=0;i<game.length;i++){
		if(game[i].getGameName().equals (gameName)){
			System.out.println("olympicGame is updated");
			game[i].setGameName(gameName);
			updateOlympicGame=true;
		}
		else{
			System.out.println("olympicGame is not updated");
		}
		
	}

	return updateOlympicGame;
}

public boolean deleteOlympicGameDetails(String gameName ){
	boolean olympic= false;
	System.out.println(" olympicGame is  created");
	for(int i=0;i<game.length;i++){
		if(game[i].getGameName().equals(gameName)){
			game[i]=null;
				olympic= true;
			
		}
		else{
			System.out.println("olympicgames is deleted");
		}
	}
return olympic;


}





}