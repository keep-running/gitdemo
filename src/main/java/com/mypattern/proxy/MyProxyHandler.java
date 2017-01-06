package com.mypattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxyHandler implements InvocationHandler {

	private Object concrete;

	public Object getConcrete() {
		return concrete;
	}

	public void setConcrete(Object concrete) {
		this.concrete = concrete;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(" ------ myProxyhandler method 'invoker' called -----");
		System.out.println("proxy:" + proxy.getClass().getName());
		System.out.println("method:" + method.getName());
		System.out.println("args:" + args[0].getClass().getName());

		System.out.println("-- before invoker ---");
		Object o = method.invoke(concrete, args);
//		Object o = method.invoke(proxy, args);
		System.out.println("-- after invoker ---");

		System.out.println("-- result in proxy is " + o);
		if (o instanceof String){
			o = o.toString() + " !";
		}
		if (o instanceof Integer)
		{
			o = (Integer)o + 1;
		}

		return o;
	}

}
