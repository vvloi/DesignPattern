package singleton.eagerinitialization.singleton;

/**
 * In eager initialization,
 * the instance of Singleton Class is created at the time of class loading, this is the easiest method to create a Singleton class.
 * This approach has one drawback. Here instance is created even though client application might not be using it. This might be a considerable issue if your 
 * Singleton class in creating a database connection or creating a socket. This may cause the memory leak problem.
 * @author vien-loi
 *
 */
public class EagerInitializeSingleton {
	private static volatile EagerInitializeSingleton eagerInitializeSingleton = new EagerInitializeSingleton();
	private EagerInitializeSingleton() {}
	
	public static EagerInitializeSingleton getInstance() {
		return eagerInitializeSingleton;
	}
}
