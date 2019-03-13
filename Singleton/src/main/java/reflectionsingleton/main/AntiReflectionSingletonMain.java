package reflectionsingleton.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import reflectionsingleton.singleton.AntiReflectionSingleton;

public class AntiReflectionSingletonMain {
	public static void main(String[] args) {
		AntiReflectionSingleton antiReflectionSingleton1 = AntiReflectionSingleton.getInstance();
		
		//Create 2nd instance using Java Reflection API.
		AntiReflectionSingleton antiReflectionSingleton2 = null;		
		try {
			Class<AntiReflectionSingleton> clazz = AntiReflectionSingleton.class;
	        Constructor<AntiReflectionSingleton> cons = clazz.getDeclaredConstructor();
	        cons.setAccessible(true);
	        antiReflectionSingleton2 = cons.newInstance();
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(antiReflectionSingleton1);
		System.out.println(antiReflectionSingleton2);
	}
}
