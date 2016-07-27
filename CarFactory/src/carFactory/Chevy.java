package carFactory;

public class Chevy implements Car {
	@Override
	public void make() {
		System.out.println("Building a Chevy... ");
	}

	@Override
	public void model() {
		System.out.println("Model type: Corvette. ");
	}
}
