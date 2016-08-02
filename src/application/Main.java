package application;

public class Main {

	public static void main(String[] args) {
		
//		Init screen
		Screen screen = new Screen(50, 50);
		screen.CleanScreen();
		
//		Init walls
		screen.addWallsRow(0); // First row
		screen.addWallsRow(screen.getScreenWidth() - 1); // Last row
		screen.addWallsColumn(0); // First column
		screen.addWallsColumn(screen.getScreenHeight() - 1); // Last column
		
//		Init player
		Snake snake = new Snake('@', 5, 5);
		screen.addSnake(snake);	
		
//		Init food
		Food food = new Food('*',(int)(Math.random() * screen.getScreenWidth()),(int)(Math.random() * screen.getScreenHeight())); // Random starting location
		screen.addFood(food);
		
//		Draw everything after inits
		screen.DrawScreen();
		
	}
}
