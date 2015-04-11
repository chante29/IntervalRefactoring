package intervals;

public class Interval {
	private Point minimum;
	private Point maximum;
	
	public Interval(Point minimum, Point maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public double midPoint() {
		return (this.getMaximum().getValue() + this.getMinimum().getValue()) / 2;
	}

	public boolean includes(double value){
		return this.getMinimum().includes(value) && this.getMaximum().includes(value);
	} 
	
	public boolean includes(Interval interval){
		return this.getMinimum().includes(interval.getMinimum()) 
				&& this.getMaximum().includes(interval.getMaximum());
	}

	public boolean intersectsWith(Interval interval) {
		return this.includes(interval.getMinimum()) || this.includes(interval.getMaximum());
	}
	
	private boolean includes(Point point){
		return this.includesInside(point) ||  this.includesInEdges(point);
	}
	
	
	private boolean includesInside(Point point){
		return (this.getMinimum().areLess(point.getValue()) && this.getMaximum().areGreatest(point.getValue()));
	}
	
	private boolean includesInEdges(Point point){
		return this.getMinimum().includesExactPoint(point) || this.getMaximum().includesExactPoint(point);
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
		return this.minimum;
	}
	
	public Point getMaximum() {
		return this.maximum;
	}
	
}
