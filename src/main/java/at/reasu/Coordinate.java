package at.reasu;

public class Coordinate {
	private int xValue;
	private int yValue;

	public Coordinate(int x, int y) {
		xValue = x;
		yValue = y;
	}

	public int getxValue() {
		return xValue;
	}

	public int getyValue() {
		return yValue;
	}

	public void setyValue(int yValue) {
		this.yValue = yValue;
	}

	public void setxValue(int xValue) {
		this.xValue = xValue;
	}
}
