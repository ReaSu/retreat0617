package at.reasu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WorldTest {
	@Test
	public void shouldGiveCell() {
		World world = new World(10, 10);
		Cell cell = world.getCellAt(new Coordinate(1,1));
		assertNotNull(cell);
	}

	@Test
	public void shouldGiveCellWithCoordinates() {
		//given
		World world = new World(10, 10);
		Coordinate expected = new Coordinate(1,1);
		//when
		Cell cell = world.getCellAt(new Coordinate(1,1));
		Coordinate realValue = cell.getCoordinate();
		//then
		assertEquals(expected.getxValue(), realValue.getxValue());
		assertEquals(expected.getyValue(), realValue.getyValue());
	}

}
// fail on invalid coordinates
