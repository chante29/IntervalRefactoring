package intervals;

public class Left_opened extends Interval {

	public Left_opened(double minimum, double maximum, Opening opening) {
		super(minimum, maximum, opening);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean includes(double value) {
		return this.getMinimum() < value && value <= this.getMaximum();
			
	}

	@Override
	public boolean includes(Interval interval) {
		boolean minimumIncluded = this.includes(interval.getMinimum());
		boolean maximumIncluded = this.includes(interval.getMaximum());
		
			switch (interval.getOpening()) {
			case BOTH_OPENED:
				return (minimumIncluded || this.getMinimum() == interval.getMinimum())
						&& (maximumIncluded || this.getMaximum() == interval.getMaximum());
			case LEFT_OPENED:
				return (minimumIncluded || this.getMinimum() == interval.getMinimum())
						&& (maximumIncluded || this.getMaximum() == interval.getMaximum());
			case RIGHT_OPENED:
				return (minimumIncluded)
						&& (maximumIncluded || this.getMaximum() == interval.getMaximum());
			case UNOPENED:
				return (minimumIncluded)
						&& (maximumIncluded || this.getMaximum() == interval.getMaximum());
			default:
				assert false;
				return false;
			}
		
	}

}
