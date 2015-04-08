package intervals;

public class Both_opened extends Interval {

	public Both_opened(double minimum, double maximum, Opening opening) {
		super(new Point(minimum, Type_point.FROM_POINT) , new Point(maximum, Type_point.UNTIL_POINT), opening);
	}
	
}
