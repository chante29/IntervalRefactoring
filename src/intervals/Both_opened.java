package intervals;

public class Both_opened extends Interval {

	public Both_opened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
	}

	@Override
	public boolean includes(double value) {
			return this.getMinimum() < value && value < this.getMaximum();
			
	}
	

	@Override
	public boolean includes(Both_opened interval) {
		boolean minimumIncluded = interval.includes(this.getMinimum());
		boolean maximumIncluded = interval.includes(this.getMaximum());
		return ((minimumIncluded || interval.getMinimum() == this.getMinimum()) && (maximumIncluded || interval.getMaximum() == this.getMaximum()));
	}

	@Override
	public boolean includes(Left_opened interval) {
		boolean minimumIncluded = interval.includes(this.getMinimum());
		boolean maximumIncluded = interval.includes(this.getMaximum());
		return ((minimumIncluded || interval.getMinimum() == this.getMinimum()) && maximumIncluded);
	}

	@Override
	public boolean includes(Right_opened interval) {
		boolean minimumIncluded = interval.includes(this.getMinimum());
		boolean maximumIncluded = interval.includes(this.getMaximum());
		return (minimumIncluded &&  (maximumIncluded || interval.getMaximum() == this.getMaximum()));
	}

	@Override
	public boolean includes(Unopened interval) {
		boolean minimumIncluded = interval.includes(this.getMinimum());
		boolean maximumIncluded = interval.includes(this.getMaximum());
		return minimumIncluded && maximumIncluded ;
	}

}
