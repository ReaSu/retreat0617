package at.reasu;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/***************************************
 * Created by regula on 10.06.17.
 ***************************************/
public class SnakeTest {

	@Test
	public void SnakeIsInitialised() throws Exception {
		Snake snake = new Snake();
		assertNotNull(snake);
	}
}
