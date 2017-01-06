package com.mypattern.factory.simple;

public class BadFruitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadFruitException() {
	}

	public BadFruitException(String msg) {
		super(msg);
	}
}
