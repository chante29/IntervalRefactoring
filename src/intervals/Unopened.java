package intervals;

public class Unopened extends Interval {

	public Unopened(double minimum, double maximum, Opening opening) {
		super(new From_exact_point(minimum), new Until_exact_point(maximum), opening);
	}
	
}
