package at.reasu;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {

	@Test
	public void snakeIsInitialised() {
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.NORTH);

		assertEquals(4, snake.getHead().getxValue());
		assertEquals(5, snake.getHead().getyValue());
		assertEquals(2, snake.getTail().getxValue());
		assertEquals(2, snake.getTail().getyValue());
		assertEquals(Direction.NORTH, snake.getDirection());
	}

	@Test
	public void snakeMovesStraight() {
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.NORTH);
		snake.moveStraigth();

		assertEquals(4, snake.getHead().getxValue());
		assertEquals(6, snake.getHead().getyValue());
		assertEquals(2, snake.getTail().getxValue());
		assertEquals(3, snake.getTail().getyValue());
		assertEquals(Direction.NORTH, snake.getDirection());
	}
}
