package intervals;

public abstract class Interval {
	private Point point;
	private Opening opening;
	
	public Interval(double minimum, double maximum, Opening opening) {
		this.setPoint(new Point(minimum, maximum));
		this.setOpening(opening);
	}

	public double midPoint() {
		return this.getPoint().midPoint();
	}

	public abstract boolean includes(double value); 
	
	public abstract boolean includes(Interval interval);

	public abstract boolean includes(Both_opened interval);
	
	public abstract boolean includes(Left_opened interval);
	
	public abstract boolean includes(Right_opened interval);
	
	public abstract boolean includes(Unopened interval);

	public boolean intersectsWith(Interval interval) {
		if (this.getPoint().getMinimum() == interval.getPoint().getMaximum()) {
			switch (opening) {
			case BOTH_OPENED:
			case LEFT_OPENED:
				return false;
			case RIGHT_OPENED:
			case UNOPENED:
				return interval.opening == Opening.LEFT_OPENED ||
						interval.opening == Opening.UNOPENED;
			default:
				assert false;
				return false;
			}
		}
		if (this.getPoint().getMaximum() == interval.getPoint().getMinimum()) {
			switch (opening) {
			case BOTH_OPENED:
			case RIGHT_OPENED:
				return false;
			case LEFT_OPENED:
			case UNOPENED:
				return interval.opening == Opening.RIGHT_OPENED ||
						interval.opening == Opening.UNOPENED;
			default:
				assert false;
				return false;
			}
		}
		return this.includes(interval.getPoint().getMinimum())
				|| this.includes(interval.getPoint().getMaximum());
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}


	public Opening getOpening() {
		return opening;
	}

	public void setOpening(Opening opening) {
		this.opening = opening;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public double getMinimum() {
		return this.getPoint().getMinimum();
	}
	
	public double getMaximum() {
		return this.getPoint().getMaximum();
	}
	
}
