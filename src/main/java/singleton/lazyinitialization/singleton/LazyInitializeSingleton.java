package singleton.lazyinitialization.singleton;

/**
 * Opposite to Eager initialization
 * This method will check if there is any instance of that class is already created?
 * If yes, then our method (getInstance()) will return that old instance and
 * if not then it creates a new instance of the singleton class in JVM and returns that instance.
 * But if we use reflection to create new instance, we will obtain two instance.
 * Or, if one more thread call getInstance, we can obtain same result in reflection case.
 * 
 * @author Duong
 *
 */
public class LazyInitializeSingleton {
	private static LazyInitializeSingleton lazyInitializeSingleton;
	
	private LazyInitializeSingleton() {};
	
	public static LazyInitializeSingleton getInstance() {
		if (lazyInitializeSingleton == null) {
			lazyInitializeSingleton = new LazyInitializeSingleton();
		}
		return lazyInitializeSingleton;
	}
}
