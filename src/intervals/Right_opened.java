package intervals;

public class Right_opened extends Interval {

	public Right_opened(double minimum, double maximum, Opening opening) {
		super(new Exact_point(new From_point(minimum)), new Until_point(maximum));
	}


}
