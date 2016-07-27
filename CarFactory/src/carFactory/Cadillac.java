package carFactory;

public class Cadillac implements Car {
	@Override
	public void make() {
		System.out.println("Building a Cadillac..");
	}

	@Override
	public void model() {
		System.out.println("Model type: CTS.");
	}
}
