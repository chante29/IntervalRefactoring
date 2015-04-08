package intervals;

public class Until_point extends Point{

	public Until_point(double minimum) {
		super(minimum, Type_point.UNTIL_POINT);
	}

	@Override
	public boolean includes(double value) {
		return this.getX() > value;
	}

	@Override
	public boolean includesExactPoint(Point point) {
		switch(point.getType()){
		case FROM_POINT:
		case FROM_EXACT_POINT:
		case UNTIL_EXACT_POINT:
			return false;
		case UNTIL_POINT:
			return this.getX() == point.getX();
		default:
			assert false;
			return this.getX() == point.getX();
		}
	}

}
