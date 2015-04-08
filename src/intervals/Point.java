package intervals;

public class Point {
	
	private double x;
	private Type_point type;

	public Point(double minimum, Type_point tipo) {
		super();
		this.x = minimum;
		this.type = tipo;
		
	}

	public double getX() {
		return x;
	}
	
	public Type_point getType(){
		return type;
	}
	
	public boolean includes(double value) {
		switch(type){
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
	
	public boolean includes (Point point){
		return this.includes(point.getX()) || this.includesExactPoint(point);
	}
	
	private boolean includesExactPoint(Point point){
		switch(type){
		case FROM_POINT:
			switch(point.getType()){
			case FROM_POINT:
				return this.getX() == point.getX();
			case FROM_EXACT_POINT:
			case UNTIL_EXACT_POINT:
			case UNTIL_POINT:
				return false;
			default:
				assert false;
				return false;
			}
		case FROM_EXACT_POINT:
			switch(point.getType()){
			case FROM_POINT:
			case FROM_EXACT_POINT:
			case UNTIL_EXACT_POINT:
				return this.getX() == point.getX();
			case UNTIL_POINT:
				return false;
			default:
				assert false;
				return false;
			}
		case UNTIL_EXACT_POINT:
			switch(point.getType()){
			case FROM_POINT:
				return false;
			case FROM_EXACT_POINT:
			case UNTIL_EXACT_POINT:
			case UNTIL_POINT:
				return this.getX() == point.getX();
			default:
				assert false;
				return false;
			}
		case UNTIL_POINT:
			switch(point.getType()){
			case FROM_POINT:
			case FROM_EXACT_POINT:
			case UNTIL_EXACT_POINT:
				return false;
			case UNTIL_POINT:
				return this.getX() == point.getX();
			default:
				assert false;
				return this.getX() == point.getX();
			}
		default:
			assert false;
			return false;
		}
	}
	
}
