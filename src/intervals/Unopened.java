package intervals;

public class Unopened extends Interval {

	public Unopened(double minimum, double maximum, Opening opening) {
		super(new Exact_point(new From_point(minimum)), new Exact_point(new Until_point(maximum)));
	}
	
}
