package one.digitalinnovation.marco.singleton;

/**
 * Singleton "pregui�oso".
 * 
 * @author falvojr
 */
public class SingietonLazy {

	private static SingietonLazy instancia;
	
	private SingietonLazy() {
		super();
	}
	
	public static SingietonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingietonLazy();
		}
		return instancia;
	}
}
