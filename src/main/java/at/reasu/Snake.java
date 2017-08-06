package at.reasu;

import static at.reasu.Direction.NORTH;

public class Snake {

	private Coordinate head;
	private Coordinate tail;
	private Direction direction;

	public Snake(Coordinate head, Coordinate tail, Direction direction) {
		this.head = head;
		this.tail = tail;
		this.direction = direction;
	}

	public Coordinate getHead() {
		return head;
	}

	public Coordinate getTail() {
		return tail;
	}

	public Direction getDirection() {
		return direction;
	}

	public void moveStraigth() {
		move(direction);
	}

	private void move(Direction direction) {
		switch (direction) {
			case NORTH:
				head.setyValue(head.getyValue() + 1);
				tail.setyValue(tail.getyValue() + 1);
				break;
			case EAST:
				head.setxValue(head.getxValue() + 1);
				tail.setxValue(tail.getxValue() + 1);
				break;
			case SOUTH:
				head.setyValue(head.getyValue() - 1);
				tail.setyValue(tail.getyValue() - 1);
				break;
			case WEST:
				head.setxValue(head.getxValue() - 1);
				tail.setxValue(tail.getxValue() - 1);
				break;
			default:
				throw new DirectionException();
		}
	}
}
