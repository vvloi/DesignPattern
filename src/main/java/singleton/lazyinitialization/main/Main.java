package singleton.lazyinitialization.main;

import singleton.lazyinitialization.singleton.LazyInitializeSingleton;

public class Main {
	public static void main(String[] args) {
		System.out.println(LazyInitializeSingleton.getInstance());
		System.out.println(LazyInitializeSingleton.getInstance());
	}
}
