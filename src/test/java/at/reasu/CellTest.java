package at.reasu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CellTest {

	@Test
	public void cellIsSnake() {
		Cell cell = new Cell(Content.Snake);
		assertEquals(Content.Snake, cell.getState());
	}

	@Test
	public void cellIsApple() {
		Cell cell = new Cell(Content.Apple);
		assertEquals(Content.Apple, cell.getState());
	}
	@Test
	public void cellIsEmpty() {
		Cell cell = new Cell(Content.Empty);
		assertEquals(Content.Empty, cell.getState());
	}
}
