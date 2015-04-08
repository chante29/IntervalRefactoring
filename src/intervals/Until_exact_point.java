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
		switch(point.getType()){
		case FROM_POINT:
			return false;
		case FROM_EXACT_POINT:
		case UNTIL_EXACT_POINT:
		case UNTIL_POINT:
			return this.getX() == point.getX();
		default:
			assert false;
			return false;
		}
	}
}
