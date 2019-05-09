package factory.service;

public abstract class AbstractService {
	public void getClassName() {
		System.out.println(this.getClass().getName());
	}
}
