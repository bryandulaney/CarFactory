package carFactory;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car buick = carFactory.getCar("Buick");
		buick.make();
		buick.model();
		Car cadillac = carFactory.getCar("Cadillac");
		cadillac.make();
		cadillac.model();
		Car chevy = carFactory.getCar("Chevy");
		chevy.make();
		chevy.model();
		Car gmc = carFactory.getCar("GMC");
		gmc.make();
		gmc.model();
	}

}
