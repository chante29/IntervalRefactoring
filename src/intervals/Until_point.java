package intervals;

public class Until_point extends Direction_point{

	public Until_point(double minimum) {
		super(minimum);
	}

	@Override
	public boolean includes(double value) {
		return this.areGreatest(value);
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
		return false;
	}

	@Override
	public boolean includesExactPoint(Until_point point) {
		return this.areEquals(point.getValue());
	}

}
