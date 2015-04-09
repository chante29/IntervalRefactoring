package intervals;

public class Exact_point extends Point {
	private Direction_point pointDirection;
	
	public Exact_point(Direction_point point) {
		super(point.getValue());
		this.pointDirection = point;
	}

	@Override
	public boolean includes(double value) {
		return this.pointDirection.includes(value) || this.areEquals(value);
	}

}
