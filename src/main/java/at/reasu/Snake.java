package at.reasu;

import java.awt.event.MouseEvent;

/***************************************
 * Created by regula on 10.06.17.
 ***************************************/
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
}
