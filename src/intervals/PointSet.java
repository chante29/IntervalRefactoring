package intervals;

public class PointSet {
	private Point minimum;
	private Point maximum;


	public PointSet(double minimum, double maximum, Opening typeInterval) {
		switch (typeInterval) {
		case BOTH_OPENED:
			this.minimum = new Point(minimum, Type_point.FROM_POINT); 
			this.maximum = new Point(maximum, Type_point.UNTIL_POINT);
			break;
		case LEFT_OPENED:
			this.minimum = new Point(minimum, Type_point.FROM_POINT); 
			this.maximum = new Point(maximum, Type_point.UNTIL_EXACT_POINT);
			break;
		case RIGHT_OPENED:
			this.minimum = new Point(minimum, Type_point.FROM_EXACT_POINT); 
			this.maximum = new Point(maximum, Type_point.UNTIL_POINT);
			break;
		case UNOPENED:
			this.minimum = new Point(minimum, Type_point.FROM_EXACT_POINT); 
			this.maximum = new Point(maximum, Type_point.UNTIL_EXACT_POINT);
			break;
		default:
			assert false;
		}
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
		return (this.minimumIncludes(interval.getMinimum()) || this.getPointMinimum().includes(interval.getPoint().getPointMinimum())) 
				&& (this.maximumIncludes(interval.getMaximum()) || this.getPointMaximum().includes(interval.getPoint().getPointMaximum()));
	}



}
