package intervals;

public class Both_opened extends Interval {

	public Both_opened(double minimum, double maximum, Opening opening) {
		super(new From_point(minimum) , new Until_point(maximum), opening);
	}
	
}
