package carFactory;

public class GMC implements Car {
	@Override
	public void make() {
		System.out.println("Building a GMC..");
	}

	@Override
	public void model() {
		System.out.println("Model type: Sierra.");
	}

}
