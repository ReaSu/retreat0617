package at.reasu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

	@Test
	public void snakeMovesIntoCell() {
		Cell cell = new Cell();

		cell.setContent(Content.Snake);

		assertEquals(Content.Snake, cell.getContent());
	}
}
