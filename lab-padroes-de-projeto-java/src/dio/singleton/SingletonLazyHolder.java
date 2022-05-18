package dio.singleton;

/*
 * Singleton "LazyHolder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */
public class SingletonLazyHolder {

	private static class InstanceHoder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	public SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() {
		return InstanceHoder.instancia;
	}
}
