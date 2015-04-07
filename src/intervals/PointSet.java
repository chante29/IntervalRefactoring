package intervals;

public class PointSet {
	private double minimum;
	private double maximum;
	
	
	public PointSet(double minimum, double maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	public double midPoint() {
		return (this.getMaximum() + this.getMinimum()) / 2;
	}
	
	public double getMinimum() {
		return minimum;
	}
	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}
	public double getMaximum() {
		return maximum;
	}
	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}
	
	
}
