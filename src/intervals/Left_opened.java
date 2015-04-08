package intervals;

public class Left_opened extends Interval {

	public Left_opened(double minimum, double maximum, Opening opening) {
		super(new From_point(minimum), new Until_exact_point(maximum), opening);
	}

}
