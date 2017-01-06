package com.mypattern.proxy;

public class MyTargetImpl implements MyTargetInterface, MyTargetInterface2 {

	@Override
	public String methodA(String a) {
		System.out.println("-- MyTargetImpl.methodA invoker -- ");
		return a + "|" + a;
	}

	@Override
	public int methodB(int b) {
		System.out.println("-- MyTargetImpl.methodB invoker -- ");
		return b + b;
	}

	@Override
	public String methodC(String c) {
		System.out.println("-- MyTargetImpl.methodC invoker -- ");
		return c;
	}

	@Override
	public int methodD(int d) {
		System.out.println("-- MyTargetImpl.methodD invoker -- ");
		return d;
	}

	
	public String selfMehod(String s){
		System.out.println("--- invoker self method ------");
		return s + " ###";
	}
}
