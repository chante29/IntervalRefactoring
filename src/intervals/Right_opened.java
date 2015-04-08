package intervals;

public class Right_opened extends Interval {

	public Right_opened(double minimum, double maximum, Opening opening) {
		super(new Point(minimum, Type_point.FROM_EXACT_POINT), new Point(maximum, Type_point.UNTIL_POINT), opening);
	}


}
