package application;

public class Screen {
	
	private int width, height;
	private char [][] screenArr;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		screenArr = new char [this.width][this.height];
	}
	
//	Fill array with dots
	public void CleanScreen() {
		for (int i = 0; i < this.height; i++) {
			for(int j = 0; j < this.width; j++) {
				screenArr[i][j] = '.';
			}
		}
	}
	
//	Print the screen to console as is
	public void DrawScreen() {
		for (int i = 0; i < height; i++) {
			for(int j = 0; j <width; j++) {
				System.out.print(screenArr[i][j]);
			}
			System.out.println();
		}
	}
	
//	Add walls at location
	public void addWall(int width, int height) {
		this.screenArr[width][height] = '#';
	}
	
//	Add horizontal line of walls
	public void addWallsRow(int rowNumber) {
		for (int i = 0; i < this.width; i++) {
			screenArr[rowNumber][i] = '#';
		}
	}
	
//	Add vertical line of walls
	public void addWallsColumn(int columnNumber) {
		for (int i = 0; i < this.height; i++) {
			screenArr[i][columnNumber] = '#';
		}
	}
	
//	Return screen width
	public int getScreenWidth() {
		return this.width;
	}
	
//	Return screen height
	public int getScreenHeight() {
		return this.height;
	}
	
//	Add snake to screen
	public void addSnake (Snake snake) {
		screenArr[snake.getXStartingLocation()][snake.getYStartingLocation()] = snake.getSymbol();
	}
	
//	Add food to screen
	public void addFood (Food food) {
		screenArr[food.getXStartingLocation()][food.getYStartingLocation()] = food.getSymbol();
	}

}
