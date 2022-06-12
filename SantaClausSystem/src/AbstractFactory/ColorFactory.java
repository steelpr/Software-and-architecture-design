package AbstractFactory;

public class ColorFactory extends AbstractFactory{
	@Override
	public
			Color getColor(String colorName) {
		if(colorName.equals("BLUE")) {
			return new Blue();
		}
		
		if(colorName.equals("RED")) {
			return new Red();
		}
		
		if(colorName == "GREEN") {
			return new Green();
		}
		System.out.println("Unknown color");
		return null;
	}

	@Override
	public
	TypeDoll getType(String typeName) {
		// Color factory... cannot return shape
		return null;
	}

}
