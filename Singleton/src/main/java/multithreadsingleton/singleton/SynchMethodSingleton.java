package multithreadsingleton.singleton;

/**
 * pros: prevent obtain two instance when call getInstance from multi thread
 * cons: Slow performance because of locking overhead. Unnecessary synchronization if the instance variable was initialized.
 * @author Duong
 *
 */
public class SynchMethodSingleton {
	private static SynchMethodSingleton synchMethodSingleton;
	
	public SynchMethodSingleton() {
		if (synchMethodSingleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");	
		}		
	};
	
	public static synchronized SynchMethodSingleton getInstance() {
		if (synchMethodSingleton == null) {
			synchMethodSingleton = new SynchMethodSingleton();	
		}
		return synchMethodSingleton;
	}
}