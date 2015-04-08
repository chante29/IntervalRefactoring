package intervals;

public class From_exact_point extends Point {

	public From_exact_point(double minimum) {
		super(minimum);
	}

	@Override
	public boolean includes(double value) {
		return this.getX() <= value;
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
	public boolean includesExactPoint(From_exact_point point) {
		return this.getX() == point.getX();
	}

	@Override
	public boolean includesExactPoint(Until_exact_point point) {
		return this.getX() == point.getX();
	}

	@Override
	public boolean includesExactPoint(Until_point point) {
		return this.getX() == point.getX();
	}

}
