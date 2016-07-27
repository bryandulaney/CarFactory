package carFactory;

public class CarFactory {
	public Car getCar(String carType) {
		if (carType == null) {
			return null;
		}
		if (carType.equalsIgnoreCase("Buick")) {
			return new Buick();
		}
		if (carType.equalsIgnoreCase("Cadillac")) {
			return new Cadillac();
		}
		if (carType.equalsIgnoreCase("Chevy")) {
			return new Chevy();
		}
		if (carType.equalsIgnoreCase("GMC")) {
			return new GMC();
		}
		return null;
	}
}
