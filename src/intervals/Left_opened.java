package intervals;

public class Left_opened extends Interval {

	public Left_opened(double minimum, double maximum, Opening opening) {
		super(new From_point(minimum), new Exact_point(new Until_point(maximum)), opening);
	}

}
