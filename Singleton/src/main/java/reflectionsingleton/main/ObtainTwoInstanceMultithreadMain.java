package reflectionsingleton.main;

import reflectionsingleton.singleton.AntiReflectionSingleton;

public class ObtainTwoInstanceMultithreadMain {
	public static void main(String[] args) {		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(AntiReflectionSingleton.getInstance());
			}		
		});	
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(AntiReflectionSingleton.getInstance());
			}		
		});
		
		thread1.start();
		thread2.start();
	}
}
