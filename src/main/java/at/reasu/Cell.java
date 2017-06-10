package at.reasu;

public class Cell {

	public Cell(Content content) {
		this.content = content;
	}

	private Content content;

	public void setContent(Content content) {
		this.content = content;
	}

	public Content getContent() {
		return content;
	}

	public Coordinate getCoordinate() {
		return new Coordinate(1,1);
	}

	public Content getState() {
		return content;
	}
}
