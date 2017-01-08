package com.mypattern.singleton;

/**
 * ÀÁººµ¥ÀýÄ£Ê½
 * @author li
 *
 */
public class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
