package at.reasu;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/***************************************
 * Created by regula on 10.06.17.
 ***************************************/
public class WorldTest {
	@Test
	public void shouldGiveCell() {
		World world = new World(10, 10);
		Cell cell = world.getCellAt(new Coordinate(1,1));
		assertNotNull(cell);
	}


}
// fail on invalid coordinates
