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
	public void snakeHeadMovesStraight_north() {
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.NORTH);
		snake.moveStraigth();

		assertEquals(4, snake.getHead().getxValue());
		assertEquals(6, snake.getHead().getyValue());
		assertEquals(Direction.NORTH, snake.getDirection());
	}

	@Test
	public void snakeTailMovesStraight_north(){
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.NORTH);
		snake.moveStraigth();

		assertEquals(2, snake.getTail().getxValue());
		assertEquals(3, snake.getTail().getyValue());
	}

	@Test
	public void snakeHeadMovesStraight_east() {
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.EAST);
		snake.moveStraigth();

		assertEquals(5, snake.getHead().getxValue());
		assertEquals(5, snake.getHead().getyValue());
		assertEquals(Direction.EAST, snake.getDirection());
	}

	@Test
	public void snakeTailMovesStraight_east() {
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.EAST);
		snake.moveStraigth();

		assertEquals(3, snake.getTail().getxValue());
		assertEquals(2, snake.getTail().getyValue());
	}

	@Test
	public void snakeHeadMovesStraight_south() {
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.SOUTH);
		snake.moveStraigth();

		assertEquals(4, snake.getHead().getxValue());
		assertEquals(4, snake.getHead().getyValue());
		assertEquals(Direction.SOUTH, snake.getDirection());
	}

	@Test
	public void snakeTailMovesStraight_south(){
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.SOUTH);
		snake.moveStraigth();

		assertEquals(2, snake.getTail().getxValue());
		assertEquals(1, snake.getTail().getyValue());
	}

	@Test
	public void snakeHeadMovesStraight_west() {
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.WEST);
		snake.moveStraigth();

		assertEquals(3, snake.getHead().getxValue());
		assertEquals(5, snake.getHead().getyValue());
		assertEquals(Direction.WEST, snake.getDirection());
	}

	@Test
	public void snakeTailMovesStraight_west(){
		Coordinate head = new Coordinate(4, 5);
		Coordinate tail = new Coordinate(2, 2);
		Snake snake = new Snake(head, tail, Direction.WEST);
		snake.moveStraigth();

		assertEquals(1, snake.getTail().getxValue());
		assertEquals(2, snake.getTail().getyValue());
	}

	@Test
	public void snakeDoesNotMoveOntoItself() {

	}

}
