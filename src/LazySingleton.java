
public class LazySingleton extends MyClone{

	private static LazySingleton instance;
	private LazySingleton() {
		if(instance!=null) {
			throw new IllegalStateException("object can't be created using reflection");
		}
	}

	

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { throw
	 * new CloneNotSupportedException(); }
	 */
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			return instance = new LazySingleton();//2 object by 2 thread
		} else {
			return instance;
		}
	}
}
