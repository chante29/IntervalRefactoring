package intervals;

public class Unopened extends Interval {

	public Unopened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean includes(Both_opened interval) {
		boolean minimumIncluded = interval.includes(this.getMinimum());
		boolean maximumIncluded = interval.includes(this.getMaximum());
		return (minimumIncluded && this.getMinimum() != interval.getMinimum())
				&& (maximumIncluded && this.getMaximum() != interval.getMaximum());
	}

	@Override
	public boolean includes(Left_opened interval) {
		boolean minimumIncluded = interval.includes(this.getMinimum());
		boolean maximumIncluded = interval.includes(this.getMaximum());
		return (minimumIncluded && this.getMinimum() != interval.getMinimum())
				&& maximumIncluded;
	}

	@Override
	public boolean includes(Right_opened interval) {
		boolean minimumIncluded = interval.includes(this.getMinimum());
		boolean maximumIncluded = interval.includes(this.getMaximum());
		return minimumIncluded 
				&& (maximumIncluded && this.getMaximum() != interval.getMaximum());
	}

	@Override
	public boolean includes(Unopened interval) {
		boolean minimumIncluded = interval.includes(this.getMinimum());
		boolean maximumIncluded = interval.includes(this.getMaximum());
		return minimumIncluded && maximumIncluded;
	}

	@Override
	public boolean includes(Interval interval) {
		return interval.includes(this);
	}
}
