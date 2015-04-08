package intervals;

public abstract class Interval {
	private PointSet point;
	private Opening opening;
	
	public Interval(Point minimum, Point maximum, Opening opening) {
		this.setPoint(new PointSet(minimum, maximum, opening));
		this.setOpening(opening);
	}

	public double midPoint() {
		return this.getPoint().midPoint();
	}

	public boolean includes(double value){
		return this.point.minimumIncludes(value) && this.point.maximumIncludes(value);
	} 
	
	public boolean includes(Interval interval){
		return this.point.includes(interval);
		//return this.point.minimumIncludes(interval.getMinimum()) && this.point.maximumIncludes(interval.getMaximum());
		
	}

	public boolean intersectsWith(Interval interval) {
		if(this.getMinimum() > interval.getMaximum() || this.getMaximum() < interval.getMinimum()){
			return false;
		}
		
		if (this.getMinimum() == interval.getMaximum()) {
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

	public PointSet getPoint() {
		return point;
	}

	public void setPoint(PointSet point) {
		this.point = point;
	}

	public double getMinimum() {
		return this.getPoint().getMinimum();
	}
	
	public double getMaximum() {
		return this.getPoint().getMaximum();
	}
	
	public Type_point getTypeMinimum(){
		return this.point.getTypeMinimum();
	}
	
	public Type_point getTypeMaximum(){
		return this.point.getTypeMaximum();
	}
	
}
