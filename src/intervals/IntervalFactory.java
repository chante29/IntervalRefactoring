package intervals;


public class IntervalFactory {

	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		switch (opening) {
        case BOTH_OPENED:
            return new Interval(new From_point(minimum) , new Until_point(maximum));
        case LEFT_OPENED:
            return new Interval(new From_point(minimum), new Exact_point(new Until_point(maximum)));
        case RIGHT_OPENED:
            return new Interval(new Exact_point(new From_point(minimum)), new Until_point(maximum));
        case UNOPENED:
            return new Interval(new Exact_point(new From_point(minimum)), new Exact_point(new Until_point(maximum)));
        default:
            throw new IllegalArgumentException("Unexpected type interval");
        }
	}
}
