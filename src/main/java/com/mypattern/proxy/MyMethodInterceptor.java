package com.mypattern.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("#### before invoker ####");
		Object result = proxy.invokeSuper(obj, args);
		System.out.println("#### before invoker ####");
		return result;
	}

}
