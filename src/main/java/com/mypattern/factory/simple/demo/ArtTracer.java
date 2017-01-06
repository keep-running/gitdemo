package com.mypattern.factory.simple.demo;

public class ArtTracer implements ShapeDraw {
	
	private ShapeDraw shapeDraw;

	@Override
	public void draw() {
		shapeDraw.draw();
	}

	@Override
	public void erase() {
		shapeDraw.erase();
	}

	public static ShapeDraw getShapeDrawInstance(String shape) throws BadShapeException{
		if (shape.equalsIgnoreCase("circle")){
			return new Circle();
		}else if (shape.equalsIgnoreCase("square")){
			return new Square();
		}else {
			throw new  BadShapeException("have no this type shape,plz check ");
		}
	}
}
