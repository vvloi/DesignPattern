package singleton.reflectionsingleton.singleton;

/**
 * When use lazy initialization singleton, reflection api will create new instance.
 * And, we will obtain two instance
 * So we must prevent it, we will throw exception if instance was existed.
 * But if one more thread call getInstance at same time. Two instance individually can was create. 
 * 
 * @author vien-loi
 *
 */
public class AntiReflectionSingleton {
	private static AntiReflectionSingleton antiReflectionSingleton;
	
	public AntiReflectionSingleton() {
		if (antiReflectionSingleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");	
		}		
	};
	
	public static AntiReflectionSingleton getInstance() {
		if (antiReflectionSingleton == null) {
			antiReflectionSingleton = new AntiReflectionSingleton();
		}
		return antiReflectionSingleton;
	}
}
