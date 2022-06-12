package Observer;

public class SubjectBike extends Observer {
	public SubjectBike(Workshop toys) {
		this.toys = toys;
		this.toys.attach(this);
	}

	@Override
	public void update() {
		System.out.println("a " + toys.getState() + "  bike is made in the workshop");
	}
}
