package application;

public class Main {

	public static void main(String[] args) {

		// Constants
		final int SCREEN_WIDTH = 100; // Columns
		final int SCREEN_HEIGHT = 50; // Rows
		final int SNAKE_STARTING_X = SCREEN_WIDTH / 2;
		final int SNAKE_STARTING_Y = SCREEN_HEIGHT / 2;

		// Init screen
		GameScreen screen = new GameScreen(SCREEN_WIDTH, SCREEN_HEIGHT);
		screen.InitScreen();

		// Init walls
		Wall wall = new Wall('#');
		wall.addWallsRow(screen, wall, 0); // First row
		wall.addWallsRow(screen, wall, screen.getScreenHeight() - 1); // Last
																		// row
		wall.addWallsColumn(screen, wall, 0); // First column
		wall.addWallsColumn(screen, wall, screen.getScreenWidth() - 1); // Last
																		// column

		// Init player
		Snake snake = new Snake('@', SNAKE_STARTING_X, SNAKE_STARTING_Y);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());

		// Init food
		Food food = new Food('*');
		food.addRandomFood(screen, food);

		// Print the screen
		screen.PrintScreen();

	}
}
