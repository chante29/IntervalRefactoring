package intervals;

public class Right_opened extends Interval {

	public Right_opened(double minimum, double maximum, Opening opening) {
		super(new From_exact_point(minimum), new Until_point(maximum), opening);
	}


}
