package application;

public class Food {
	private int xStartingLocation, yStartingLocation;
	private char foodSymbol;
	
	public Food(char foodSymbol, int xStartingLocation, int yStartingLocation) {
		this.foodSymbol = foodSymbol;
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
		return foodSymbol;
	}
}
