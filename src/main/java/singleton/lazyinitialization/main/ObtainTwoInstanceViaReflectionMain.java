package singleton.lazyinitialization.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import singleton.lazyinitialization.singleton.LazyInitializeSingleton;

public class ObtainTwoInstanceViaReflectionMain {
	public static void main(String[] args) {
		LazyInitializeSingleton lazyInitializeSingleton1 = LazyInitializeSingleton.getInstance();
		
		//Create 2nd instance using Java Reflection API.
		LazyInitializeSingleton lazyInitializeSingleton2 = null;		
		try {
			Class<LazyInitializeSingleton> clazz = LazyInitializeSingleton.class;
	        Constructor<LazyInitializeSingleton> cons = clazz.getDeclaredConstructor();
	        cons.setAccessible(true);
	        lazyInitializeSingleton2 = cons.newInstance();
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(lazyInitializeSingleton1);
		System.out.println(lazyInitializeSingleton2);
	}
}
