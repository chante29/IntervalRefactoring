package intervals;

public class PointSet {
	private Point minimum;
	private Point maximum;

	public PointSet(Point minimum, Point maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double midPoint() {
		return (this.getMaximum().getValue() + this.getMinimum().getValue()) / 2;
	}

	public Point getMinimum() {
		return minimum;
	}

	public Point getMaximum() {
		return maximum;
	}

	public boolean includes(Interval interval) {
		return this.getMinimum().includes(interval.getMinimum()) 
				&& this.getMaximum().includes(interval.getMaximum());
	}
	
	
	public boolean intersectWith(Point point){
		return this.includesInside(point) || this.includesInEdges(point);
	}
	
	private boolean includesInside(Point point){
		return (this.getMinimum().areLess(point.getValue()) && this.getMaximum().areGreatest(point.getValue()));
	}
	
	private boolean includesInEdges(Point point){
		return this.getMinimum().includesExactPoint(point) || this.getMaximum().includesExactPoint(point);
	}



}
