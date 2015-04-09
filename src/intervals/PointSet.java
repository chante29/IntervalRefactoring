package intervals;

public class PointSet {
	private Point minimum;
	private Point maximum;

	public PointSet(Point minimum, Point maximum, Opening typeInterval) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double midPoint() {
		return (this.getMaximum() + this.getMinimum()) / 2;
	}

	public double getMinimum() {
		return minimum.getValue();
	}

	public double getMaximum() {
		return maximum.getValue();
	}

	public boolean minimumIncludes(double value){
		return this.minimum.includes(value);
	}

	public boolean maximumIncludes(double value){
		return this.maximum.includes(value);
	}

	
	public Point getPointMinimum(){
		return this.minimum;
	}
	
	public Point getPointMaximum(){
		return this.maximum;
	}

	public boolean includes(Interval interval) {
		return this.getPointMinimum().includes(interval.getPointMinimum()) 
				&& this.getPointMaximum().includes(interval.getPointMaximum());
	}
	
	public boolean intersectWith(Point point){
		return (this.getPointMinimum().getValue() < point.getValue() && this.getPointMaximum().getValue() > point.getValue())
				|| (this.getPointMinimum().includesExactPoint(point) || this.getPointMaximum().includesExactPoint(point));
	}



}
