package intervals;

public abstract class Point {
	
	private double value;

	public Point(double minimum) {
		super();
		this.value = minimum;
	}

	public double getValue() {
		return value;
	}
	
	public abstract boolean includes(double value);

	
	public boolean includes (Point point){
		return this.includes(point.getValue()) || this.includesExactPoint(point);
	}
	
	public abstract boolean includesExactPoint(Point point);
	
	public abstract boolean includesExactPoint(From_point point);
	
	public abstract boolean includesExactPoint(From_exact_point point);
	
	public abstract boolean includesExactPoint(Until_exact_point point);
	
	public abstract boolean includesExactPoint(Until_point point);
	
	public boolean areLess(double value){
		return this.getValue() < value;
	}
	
	public boolean areGreatest(double value){
		return this.getValue() > value;
	}
	
	public boolean areEquals(double value){
		return this.getValue() == value;
	}
	
}
