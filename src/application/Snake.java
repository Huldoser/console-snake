package application;

public class Snake extends GameObject {

	public Snake(char symbol, int xStartingLocation, int yStartingLocation) {
		setSymbol(symbol);
		setX(xStartingLocation);
		setY(yStartingLocation);
	}
}