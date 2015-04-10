package intervals;

public class Interval {
	private PointSet pointSet;
	
	public Interval(Point minimum, Point maximum) {
		this.pointSet = new PointSet(minimum, maximum);
	}

	public double midPoint() {
		return this.pointSet.midPoint();
	}

	public boolean includes(double value){
		return this.pointSet.minimumIncludes(value) && this.pointSet.maximumIncludes(value);
	} 
	
	public boolean includes(Interval interval){
		return this.pointSet.includes(interval);
	}

	public boolean intersectsWith(Interval interval) {
		return this.pointSet.intersectWith(interval.getPointMinimum()) || this.pointSet.intersectWith(interval.getPointMaximum());
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
	
	public Point getPointMinimum() {
		return this.pointSet.getPointMinimum();
	}
	
	public Point getPointMaximum() {
		return this.pointSet.getPointMaximum();
	}
	
	public double getMinimum() {
		return this.pointSet.getMinimum();
	}
	
	public double getMaximum() {
		return this.pointSet.getMaximum();
	}
	
}
