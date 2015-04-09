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
	
	public boolean includesExactPoint(Point point){
		return this.getClass().equals(point.getClass()) && this.areEquals(point.getValue());
	}
	
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
