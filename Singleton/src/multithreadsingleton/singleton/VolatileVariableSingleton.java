package multithreadsingleton.singleton;

import java.io.Serializable;

/**
 * pros: the synchronized block will be executed only when the volatileVariableSingleton is null 
 * and prevent unnecessary synchronization once the instance variable is initialized
 * and with volatile variable guaranteeing happens-before relationship,
 * all the write will happen on volatile volatileVariableSingleton before any read of volatileVariableSingleton variable.
 * 
 * cons: serialization can create two object
 * @author Duong
 *
 */
public class VolatileVariableSingleton implements Serializable {
	private static final long serialVersionUID = 1L;
	private static volatile VolatileVariableSingleton volatileVariableSingleton;
	
	public VolatileVariableSingleton() {
		if (volatileVariableSingleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");	
		}		
	};
	
	public static VolatileVariableSingleton getInstance() {
		if (volatileVariableSingleton == null) {
			synchronized (SyncBlockSingleton.class) {
				if (volatileVariableSingleton == null) {
					volatileVariableSingleton = new VolatileVariableSingleton();	
				}
			}
			
		}
		return volatileVariableSingleton;
	}
}
