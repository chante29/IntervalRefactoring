package intervals;

public class Exact_point extends Point {
	private Direction_point pointDirection;
	
	public Exact_point(Direction_point point) {
		super(point.getValue());
		this.pointDirection = point;
	}

	@Override
	public boolean includes(double value) {
		return false;
	}

	@Override
	public boolean includesExactPoint(Point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean includesExactPoint(From_point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean includesExactPoint(From_exact_point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean includesExactPoint(Until_exact_point point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean includesExactPoint(Until_point point) {
		// TODO Auto-generated method stub
		return false;
	}

}
