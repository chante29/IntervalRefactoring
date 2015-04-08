package intervals;

public class Until_exact_point extends Point {

	public Until_exact_point(double minimum) {
		super(minimum, Type_point.UNTIL_EXACT_POINT);
	}

	@Override
	public boolean includes(double value) {
		return this.getX() >= value;
	}

	@Override
	public boolean includesExactPoint(Point point) {
		return point.includesExactPoint(this);
	}

	@Override
	public boolean includesExactPoint(From_point point) {
		return this.getX() == point.getX();
	}

	@Override
	public boolean includesExactPoint(From_exact_point point) {
		return this.getX() == point.getX();
	}

	@Override
	public boolean includesExactPoint(Until_exact_point point) {
		return this.getX() == point.getX();
	}

	@Override
	public boolean includesExactPoint(Until_point point) {
		return false;
	}
}
