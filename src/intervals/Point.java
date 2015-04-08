package intervals;

public class Point {
	
	private double x;
	private Type_point tipo;

	public Point(double minimum, Type_point tipo) {
		super();
		this.x = minimum;
		this.tipo = tipo;
		
	}

	public double getX() {
		return x;
	}
	
	public boolean includes(double value) {
		switch(tipo){
		case FROM_POINT:
			return this.getX() < value;
		case FROM_EXACT_POINT:
			return this.getX() <= value;
		case UNTIL_EXACT_POINT:
			return this.getX() >= value;
		case UNTIL_POINT:
			return this.getX() > value;
		default:
			assert false;
			return false;
		
		}
		
	}
	
}
