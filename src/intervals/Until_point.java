package intervals;

public class Until_point extends Direction_point{

	public Until_point(double minimum) {
		super(minimum);
	}

	@Override
	public boolean includes(double value) {
		return this.areGreatest(value);
	}

}
