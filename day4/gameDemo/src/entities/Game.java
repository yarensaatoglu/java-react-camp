package entities;

public class Game {
   private int gameID;
   private String gameName;
   private double gamePrice;
   
   
   
public Game(int gameID, String gameName, double gamePrice) {
	super();
	this.gameID = gameID;
	this.gameName = gameName;
	this.gamePrice = gamePrice;
}
public int getGameID() {
	return gameID;
}
public void setGameID(int gameID) {
	this.gameID = gameID;
}
public String getGameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public double getGamePrice() {
	return gamePrice;
}
public void setGamePrice(double gamePrice) {
	this.gamePrice = gamePrice;
}
   
   
   
}