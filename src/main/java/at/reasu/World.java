package at.reasu;

public class World {

	private int width;
	private int height;

	public World(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Cell getCellAt(Coordinate coordinate) {
		return new Cell(Content.Empty);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
