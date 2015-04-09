package intervals;

public class From_exact_point extends Point {

	public From_exact_point(double minimum) {
		super(minimum);
	}

	@Override
	public boolean includes(double value) {
		return this.areLess(value) && this.areEquals(value);
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
		return this.areEquals(point.getValue());
	}

	@Override
	public boolean includesExactPoint(Until_exact_point point) {
		return this.areEquals(point.getValue());
	}

	@Override
	public boolean includesExactPoint(Until_point point) {
		return false;
	}

}
