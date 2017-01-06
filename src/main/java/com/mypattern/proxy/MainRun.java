package com.mypattern.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;

import com.mypattern.proxy.utils.ProxyUtils;

import net.sf.cglib.proxy.Enhancer;

public class MainRun {
	public static void main(String[] args) {

		// runProxy();

		// runGenerateClass();

		// cglibTest();

		newClass();

	}

	private static void newClass() {
		try {
			Class clz = Class.forName("com.test.generator.HelloBean");
			Object object = clz.newInstance();
			Method[] methods = object.getClass().getDeclaredMethods();
			for (Method m : methods) {
				System.out.println(m.getName());
				Parameter[] ps = m.getParameters();
				for (Parameter p : ps) {
					System.out.println(p.getName()+" , " + p.getType().getName());
				}
				m.invoke(object, ps);
			}
//			System.out.println(object.getClass().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void cglibTest() {
		MyMethodInterceptor interceptor = new MyMethodInterceptor();
		MyTargetImpl target = new MyTargetImpl();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(interceptor);

		MyTargetImpl proxy = (MyTargetImpl) enhancer.create();

		String result = proxy.selfMehod("hahaha");
		System.out.println("____ return value is " + result);

	}

	private static void runGenerateClass() {
		MyTargetImpl target = new MyTargetImpl();
		ProxyUtils.generateProxyClassFile(target.getClass(), "MyGenerateTargetProxy");
	}

	private static void runProxy() {
		MyProxyHandler myProxyHandler = new MyProxyHandler();
		MyTargetImpl targetImpl = new MyTargetImpl();
		myProxyHandler.setConcrete(targetImpl);

		Object o = Proxy.newProxyInstance(targetImpl.getClass().getClassLoader(), targetImpl.getClass().getInterfaces(),
				myProxyHandler);
		MyTargetInterface mtf = (MyTargetInterface) o;

		String aa = mtf.methodA("aaa");
		System.out.println(aa);
		System.out.println();
		int bb = mtf.methodB(2);
		System.out.println(bb);

		MyTargetInterface2 mtf2 = (MyTargetInterface2) o;

		String cc = mtf2.methodC("ccc");
		System.out.println(cc);
		System.out.println();
		int dd = mtf2.methodD(6);
		System.out.println(dd);
	}
}
