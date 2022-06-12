package Observer;

public class SubjectDoll extends Observer {
	public SubjectDoll(Workshop toys) {
		this.toys = toys;
		this.toys.attach(this);
	}

	@Override
	public void update() {
		System.out.println("a " + toys.getState() + " doll is made in the workshop");
	}
}
