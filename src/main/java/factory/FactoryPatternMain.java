package factory;

import factory.pattern.ServiceFactory;
import factory.service.AbstractService;

public class FactoryPatternMain {

	public static void main(String[] args) {
		String[] serviceKeys = { ServiceFactory.A_SERVICE, ServiceFactory.B_SERVICE };
		ServiceFactory serviceFactory = new ServiceFactory();
		for (String key: serviceKeys) {
			executeFactory(key, serviceFactory);
		}
	}
	
	public static void executeFactory(String key, ServiceFactory serviceFactory) {
		try {			
			AbstractService abstractService = serviceFactory.createInstance(key);
			abstractService.getClassName();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
