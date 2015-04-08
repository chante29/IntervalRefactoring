package intervals;

public class Unopened extends Interval {

	public Unopened(double minimum, double maximum, Opening opening) {
		super(new Point(minimum, Type_point.FROM_EXACT_POINT), new Point(maximum, Type_point.UNTIL_EXACT_POINT), opening);
	}
	
}
