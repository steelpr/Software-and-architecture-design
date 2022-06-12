package Singleton;

public class SantaClaus {

	private static SantaClaus instance;

	private SantaClaus() {
		// TODO Auto-generated constructor stub
	}

	public static SantaClaus getInstance() {

		if (instance == null) {
			instance = new SantaClaus();
		}

		return instance;
	}

	public void postMessage(String message) {
		System.out.println(message);
	}
}
