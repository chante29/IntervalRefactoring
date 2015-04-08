package intervals;

public abstract class Point {
	
	private double x;
	private Type_point type;

	public Point(double minimum, Type_point type) {
		super();
		this.x = minimum;
		this.type = type;
		
	}

	public double getX() {
		return x;
	}
	
	public Type_point getType(){
		return type;
	}
	
	public abstract boolean includes(double value);

	
	public boolean includes (Point point){
		return this.includes(point.getX()) || this.includesExactPoint(point);
	}
	
	public abstract boolean includesExactPoint(Point point);
	
}
