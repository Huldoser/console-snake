package application;

public class Snake {
	private int xLocation, yLocation;
	private int xStartingLocation, yStartingLocation;
	private char snakeSymbol;
	
	public Snake(char snakeSymbol, int xStartingLocation, int yStartingLocation) {
		this.snakeSymbol = snakeSymbol;
		this.xStartingLocation = xStartingLocation;
		this.yStartingLocation = yStartingLocation;
	}
	
//	Getters
	public int getXStartingLocation() {
		return this.xStartingLocation;
	}
	
	public int getYStartingLocation() {
		return this.yStartingLocation;
	}
	
	public char getSymbol() {
		return snakeSymbol;
	}
}