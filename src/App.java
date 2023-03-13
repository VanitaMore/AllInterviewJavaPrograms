import java.lang.Runtime;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class App  {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		/*
		 * EagerSingleton obj1 = EagerSingleton.getInstance();
		 * 
		 * System.out.println(obj1.hashCode());
		 * 
		 * EagerSingleton obj2 = EagerSingleton.getInstance();
		 * 
		 * System.out.println(obj2.hashCode());
		 */
		
		
		  LazySingleton obj1 = LazySingleton.getInstance();
		  
		  System.out.println(obj1.hashCode());
		  LazySingleton reflectionInstance=null;
		  
		  Constructor[] constructors =LazySingleton.class.getDeclaredConstructors();
		  for(Constructor constructor :constructors) {
			  constructor.setAccessible(true);
			  reflectionInstance=(LazySingleton)constructor.newInstance();
		  }
		  System.out.println(reflectionInstance.hashCode());
			/*
			 * LazySingleton obj2 = (LazySingleton)obj1.clone();
			 * 
			 * System.out.println(obj2.hashCode());
			 */
		
		
		/*
		 * DoubleCheckingLazySingleton obj1 = DoubleCheckingLazySingleton.getInstance();
		 * 
		 * System.out.println(obj1.hashCode());
		 * 
		 * DoubleCheckingLazySingleton obj2 = DoubleCheckingLazySingleton.getInstance();
		 * 
		 * System.out.println(obj2.hashCode());
		 */
	}
}
