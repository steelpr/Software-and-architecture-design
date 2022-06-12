package AbstractFactory;

public class TypeFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeDoll getType(String shapeName) {
		if (shapeName.equals("BARBIE")) {
			return new BarbieDoll();
		}

		if (shapeName.equals("BABY")) {
			return new BabyDoll();
		}
		System.out.println("Unknown shape");
		return null;
	}

}
