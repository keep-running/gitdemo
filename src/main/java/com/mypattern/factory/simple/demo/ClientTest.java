package com.mypattern.factory.simple.demo;

import java.io.IOException;

public class ClientTest {

	public static void main(String[] args) {
//		try {
//			ShapeDraw shape = ArtTracer.getShapeDrawInstance("circle");
//			shape.draw();
//		} catch (BadShapeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Runtime runtime = Runtime.getRuntime();
		long maxMemory = runtime.maxMemory()/1024L;
		System.out.println(maxMemory);
		try {
			runtime.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
