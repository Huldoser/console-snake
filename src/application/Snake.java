package application;

public class Snake extends GameObject {

	public Snake(char symbol, int xStartingLocation, int yStartingLocation) {
		setSymbol(symbol);
		setX(xStartingLocation);
		setY(yStartingLocation);
	}
	
	public void moveLeft(GameScreen screen, Snake snake) {
		snake.setX(getX() - 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX() + 1, snake.getY());
	}
	
	public void moveRight(GameScreen screen, Snake snake) {
		snake.setX(getX() + 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX() - 1, snake.getY());
	}
	
	public void moveUp(GameScreen screen, Snake snake) {
		snake.setY(getY() - 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX(), snake.getY() + 1);
	}
	
	public void moveDown(GameScreen screen, Snake snake) {
		snake.setY(getY() + 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX(), snake.getY() - 1);
	}
}