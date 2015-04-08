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
		return minimum.getX();
	}

	public double getMaximum() {
		return maximum.getX();
	}

	public boolean minimumIncludes(double value){
		return this.minimum.includes(value);
	}

	public boolean maximumIncludes(double value){
		return this.maximum.includes(value);
	}

	public Type_point getTypeMinimum(){
		return this.minimum.getType();
	}

	public Type_point getTypeMaximum(){
		return this.maximum.getType();
	}
	
	public Point getPointMinimum(){
		return this.minimum;
	}
	
	public Point getPointMaximum(){
		return this.maximum;
	}

	public boolean includes(Interval interval) {
		return this.getPointMinimum().includes(interval.getPoint().getPointMinimum()) 
				&& this.getPointMaximum().includes(interval.getPoint().getPointMaximum());
	}



}
