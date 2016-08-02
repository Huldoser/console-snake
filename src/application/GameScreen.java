package application;

public class GameScreen {

	private int width, height;
	private char[][] screenMatrix;

	public GameScreen(int width, int height) {
		this.width = width;
		this.height = height;
		screenMatrix = new char[this.width][this.height];
	}

	// Fill array with dots
	public void CleanScreen() {
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				screenMatrix[i][j] = '.';
			}
		}
	}

	// Print the screen to console
	public void PrintScreen() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(screenMatrix[i][j]);
			}
			System.out.println();
		}
	}

	// Getters
	public int getScreenWidth() {
		return this.width;
	}

	public int getScreenHeight() {
		return this.height;
	}

	// Setters
	public void setObjectOnLocation(GameObject object, int x, int y) {
		this.screenMatrix[x][y] = object.getSymbol();
	}
}
