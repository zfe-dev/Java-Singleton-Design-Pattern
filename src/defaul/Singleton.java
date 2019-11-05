package defaul;
public class Singleton {

	private static Singleton singleton = null; // = new Singleton() -> eager
	
	private Singleton() {
		System.out.println("Je sui crée");
	}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton(); // lazy 
		}
		return singleton;
	}
	
}
