package multithreadsingleton.singleton;

/**
 * pros: the synchronized block will be executed only when the syncBlockSingleton is null 
 * and prevent unnecessary synchronization once the instance variable is initialized.
 * 
 * cons: another thread in Java to see half initialized state of syncBlockSingleton variable
 * 
 * @author Duong
 *
 */
public class SyncBlockSingleton {
	private static SyncBlockSingleton syncBlockSingleton;
	
	public SyncBlockSingleton() {
		if (syncBlockSingleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");	
		}		
	};
	
	public static SyncBlockSingleton getInstance() {
		if (syncBlockSingleton == null) {
			synchronized (SyncBlockSingleton.class) {
				if (syncBlockSingleton == null) {
					syncBlockSingleton = new SyncBlockSingleton();	
				}
			}
			
		}
		return syncBlockSingleton;
	}
}