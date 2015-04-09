package intervals;

public abstract class Interval {
	private PointSet pointSet;
	private Opening opening;
	
	public Interval(Point minimum, Point maximum, Opening opening) {
		this.pointSet = new PointSet(minimum, maximum, opening);
		this.setOpening(opening);
	}

	public double midPoint() {
		return this.getPointSet().midPoint();
	}

	public boolean includes(double value){
		return this.pointSet.minimumIncludes(value) && this.pointSet.maximumIncludes(value);
	} 
	
	public boolean includes(Interval interval){
		return this.pointSet.includes(interval);
	}

	public boolean intersectsWith(Interval interval) {
		return this.getPointSet().intersectWith(interval.getPointSet().getPointMinimum()) || this.getPointSet().intersectWith(interval.getPointSet().getPointMaximum());
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

	public PointSet getPointSet() {
		return pointSet;
	}
	
	public double getMinimum() {
		return this.getPointSet().getMinimum();
	}
	
	public double getMaximum() {
		return this.getPointSet().getMaximum();
	}
	
}
