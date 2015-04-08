package intervals;

public class Left_opened extends Interval {

	public Left_opened(double minimum, double maximum, Opening opening) {
		super(new Point(minimum, Type_point.FROM_POINT), new Point(maximum, Type_point.UNTIL_EXACT_POINT), opening);
	}

}
