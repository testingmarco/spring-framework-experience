package one.digitalinnovation.marco.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author falvojr
 */
public class SigletonLazyHolder {

	private static class InstanceHolder {
		public static SigletonLazyHolder instancia = new SigletonLazyHolder();
	}
	
	private SigletonLazyHolder() {
		super();
	}
	
	public static SigletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
