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
	}

	public boolean intersectsWith(Interval interval) {
		return this.getPoint().intersectWith(interval.getPoint().getPointMinimum()) || this.getPoint().intersectWith(interval.getPoint().getPointMaximum());
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
	
}
