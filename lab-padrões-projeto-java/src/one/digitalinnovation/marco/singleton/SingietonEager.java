package one.digitalinnovation.marco.singleton;

/**
 * Singleton "pregui�oso".
 * 
 * @author falvojr
 */
public class  SingietonEager {

	private static SingietonEager instancia = new SingietonEager();
	
	private  SingietonEager() {
		super();
	}
	
	public static  SingietonEager getInstancia() {
		return instancia;
	}
	}

