package intervals;

public class PointSet {
	private Point minimum;
	private Point maximum;
	
	
	public PointSet(double minimum, double maximum, Opening typeInterval) {
		switch (typeInterval) {
		case BOTH_OPENED:
			this.minimum = new Point(minimum, Type_point.FROM_POINT); 
			this.maximum = new Point(maximum, Type_point.UNTIL_POINT);
		case LEFT_OPENED:
			this.minimum = new Point(minimum, Type_point.FROM_POINT); 
			this.maximum = new Point(maximum, Type_point.UNTIL_EXACT_POINT);
		case RIGHT_OPENED:
			this.minimum = new Point(minimum, Type_point.FROM_EXACT_POINT); 
			this.maximum = new Point(maximum, Type_point.UNTIL_POINT);
		case UNOPENED:
			this.minimum = new Point(minimum, Type_point.FROM_EXACT_POINT); 
			this.maximum = new Point(maximum, Type_point.UNTIL_EXACT_POINT);
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
	
	
}
