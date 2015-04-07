package intervals;

public class Unopened extends Interval {

	public Unopened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean includes(double value) {
		return this.getMinimum() <= value && value <= this.getMaximum();
	}

}
