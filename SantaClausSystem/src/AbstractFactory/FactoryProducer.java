package AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryName) {

		if (factoryName.equals("TYPE")) {
			return new TypeFactory();
		}

		if (factoryName.equals("COLOR")) {
			return new ColorFactory();
		}

		System.out.println("Unknown factory");
		return null;

	}
}
