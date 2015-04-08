package intervals;

public class From_point extends Point{

	public From_point(double minimum) {
		super(minimum, Type_point.FROM_POINT);
	}

	@Override
	public boolean includes(double value) {
		return this.getX() < value;
	}

	@Override
	public boolean includesExactPoint(Point point) {
		switch(point.getType()){
		case FROM_POINT:
			return this.getX() == point.getX();
		case FROM_EXACT_POINT:
		case UNTIL_EXACT_POINT:
		case UNTIL_POINT:
			return false;
		default:
			assert false;
			return false;
		}
	}
}
