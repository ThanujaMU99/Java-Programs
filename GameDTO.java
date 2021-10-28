public class GameDTO{

public GameDTO(){
System.out.println("object is created");
}

private String gameName;
private int players;

public void setGameName(String gameName){
this.gameName=gameName;
}
public String getGameName(){
return gameName;
}

public void setPlayers(int players){
this.players=players;
}
public int getPlayers(){
return players;
}
@Override
public String toString(){
return "GameDTO----[gameName="+this.gameName+",players="+this.players+"]";
}

}