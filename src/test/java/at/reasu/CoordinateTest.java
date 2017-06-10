package at.reasu;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	@Test
	public void XValueCanBeQueried() {
		Coordinate coordinate = new Coordinate(2,3);

//		refactor to thenXShouldBe(2);
		int x = coordinate.getxValue();
		Assert.assertEquals(x, 2);
	}

	@Test
	public void XValueIsInitialisedFromConstructor() {
		Coordinate coordinate = new Coordinate(3,3);

//		refactor ro thenXShouldBe(3);
		int x = coordinate.getxValue();
		Assert.assertEquals(x, 3);
	}

//	{
//		whenCoordinateIsConstructedWith(2, 3);
//		thenXShouldBe(2);
//	}
//
//	private void thenXShouldBe(int expected)
//	{
//		int x = coordinate.getxValue();
//		Assert.assertEquals(expected, 3);
//	}
}

// test list
// position y coordinate set
// new snake starts going right (direction)
// snake goes right (increases x)
