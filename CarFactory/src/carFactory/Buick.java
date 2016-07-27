package carFactory;

public class Buick implements Car {
	@Override
	public void make() {
		System.out.println("Building a Buick..");
	}
	
	@Override
	public void model() {
		System.out.println("Model type: Regal.");
	}
}
