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

	@Override
	public boolean includesExactPoint(Point point) {
		return point.includesExactPoint(this);
	}

	@Override
	public boolean includesExactPoint(From_point point) {
		return false;
	}

	@Override
	public boolean includesExactPoint(Exact_point point) {
		return this.areEquals(point.getValue());
	}
	
	@Override
	public boolean includesExactPoint(Until_point point) {
		return false;
	}

}
