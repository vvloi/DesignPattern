package factory.pattern;

import java.util.LinkedHashMap;
import java.util.Map;

import factory.service.AService;
import factory.service.AbstractService;
import factory.service.BService;

public class ServiceFactory {
	// we can change constants value by class name
	public static final String A_SERVICE = "A_SERVICE";
	public static final String B_SERVICE = "B_SERVICE";
	private Map<String, Class<?>> map = new LinkedHashMap<>();
	
	public ServiceFactory() {
		map.put(A_SERVICE, AService.class);
		map.put(B_SERVICE, BService.class);		
	}
	
	public AbstractService createInstance(String key) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = map.get(key);
		return (AbstractService) clazz.newInstance();
	}
}
