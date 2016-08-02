package application;

public class Food extends GameObject {

	public Food(char symbol) {
		setSymbol(symbol);
	}

	// Add food to random location inside the matrix limits
	public void addRandomFood(GameScreen screen, Food food) {
		screen.setObjectOnLocation(food, (int) (Math.random() * Main.SCREEN_WIDTH) - 1,
				(int) (Math.random() * Main.SCREEN_HEIGHT) - 1);
	}
}
