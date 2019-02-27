package serializationsingleton.singleton;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
	private static final long serialVersionUID = 1L;
	private static volatile SerializationSingleton serializationSingleton;
	
	public SerializationSingleton() {
		if (serializationSingleton != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");	
		}		
	};
	
	public static SerializationSingleton getInstance() {
		if (serializationSingleton == null) {
			synchronized (SerializationSingleton.class) {
				if (serializationSingleton == null) {
					serializationSingleton = new SerializationSingleton();	
				}
			}
			
		}
		return serializationSingleton;
	}
	
	//Make singleton from serialize and deserialize operation.
    protected SerializationSingleton readResolve() {
        return getInstance();
    }
}
