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
		return this.pointSet.getMinimum().includes(value) && this.pointSet.getMaximum().includes(value);
	} 
	
	public boolean includes(Interval interval){
		return this.pointSet.includes(interval);
	}

	public boolean intersectsWith(Interval interval) {
		return this.pointSet.intersectWith(interval.getMinimum()) || this.pointSet.intersectWith(interval.getMaximum());
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
	
	public Point getMinimum() {
		return this.pointSet.getMinimum();
	}
	
	public Point getMaximum() {
		return this.pointSet.getMaximum();
	}
	
}
