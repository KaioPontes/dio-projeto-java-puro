package one.digitalinnovation.gof.singleton;

/**
 * 
 * Singleton "preguiçoso".
 * 
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInsntancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}