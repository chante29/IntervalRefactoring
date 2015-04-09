package intervals;

public abstract class Point {
	
	private double x;

	public Point(double minimum) {
		super();
		this.x = minimum;
	}

	public double getX() {
		return x;
	}
	
	public abstract boolean includes(double value);

	
	public boolean includes (Point point){
		return this.includes(point.getX()) || this.includesExactPoint(point);
	}
	
	public abstract boolean includesExactPoint(Point point);
	
	public abstract boolean includesExactPoint(From_point point);
	
	public abstract boolean includesExactPoint(From_exact_point point);
	
	public abstract boolean includesExactPoint(Until_exact_point point);
	
	public abstract boolean includesExactPoint(Until_point point);
	
	public boolean areLess(Point point){
		return this.getX() < point.getX();
	}
	
	public boolean areGreatest(Point point){
		return this.getX() > point.getX();
	}
	
	public boolean areEquals(Point point){
		return this.getX() == point.getX();
	}
	
}
