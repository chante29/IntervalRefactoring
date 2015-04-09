package intervals;

public class From_point extends Direction_point{

	public From_point(double minimum) {
		super(minimum);
	}

	@Override
	public boolean includes(double value) {
		return this.areLess(value);
	}

	@Override
	public boolean includesExactPoint(Point point) {
		return point.includesExactPoint(this);
	}

	@Override
	public boolean includesExactPoint(From_point point) {
		return this.areEquals(point.getValue());
	}

	@Override
	public boolean includesExactPoint(From_exact_point point) {
		return false;
	}

	@Override
	public boolean includesExactPoint(Until_exact_point point) {
		return false;
	}

	@Override
	public boolean includesExactPoint(Until_point point) {
		return false;
	}
}
