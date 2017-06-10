package at.reasu;

import org.junit.Test;

import static org.junit.Assert.*;

/***************************************
 * Created by regula on 10.06.17.
 ***************************************/
public class SnakeTest {

	@Test
	public void SnakeIsInitialised() throws Exception {
		Snake snake = new Snake();
		assertNotNull(snake);
	}

	@Test
	public void snakeIsDeployed() throws Exception {
		int x=2;
		int y=2;
		Coordinate initSnakePos = new Coordinate(x,y);
		World worldSize = new World(x, y);
		assertEquals(true,initSnakePos.getxValue() > worldSize.getWidth());
	}
}
