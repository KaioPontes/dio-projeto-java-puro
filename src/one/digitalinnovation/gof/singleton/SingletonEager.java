package one.digitalinnovation.gof.singleton;

/**
 * 
 * Singleton "apressado".
 * 
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInsntancia() {
		return instancia;
	}

}