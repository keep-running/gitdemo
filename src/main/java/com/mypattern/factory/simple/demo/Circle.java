package com.mypattern.factory.simple.demo;

public class Circle implements ShapeDraw {

	@Override
	public void draw() {
		System.out.println("Cirle drawing ...");

	}

	@Override
	public void erase() {
		System.out.println("Cirle erased ¡£");
	}

}
