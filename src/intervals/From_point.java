package intervals;

public class From_point extends Direction_point{

	public From_point(double minimum) {
		super(minimum);
	}

	@Override
	public boolean includes(double value) {
		return this.areLess(value);
	}
}
