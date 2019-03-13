package lazyinitialization.main;

import lazyinitialization.singleton.LazyInitializeSingleton;

public class ObtainTwoInstanceMultiThreadMain {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(LazyInitializeSingleton.getInstance());
			}		
		});	
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(LazyInitializeSingleton.getInstance());
			}		
		});
		
		thread1.start();
		thread2.start();		
	}
}
