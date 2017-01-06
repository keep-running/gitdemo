package com.mypattern.factory.simple.demo;

public class Square implements ShapeDraw {

	@Override
	public void draw() {
		System.out.println("Square drawing ...");

	}

	@Override
	public void erase() {
		System.out.println("Square erased ¡£");
	}

}
