package com.mypattern.proxy.utils;

import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

public class ProxyUtils {

	public static void generateProxyClassFile(Class<?> clazz, String proxyClassName) {
		byte[] classFile = ProxyGenerator.generateProxyClass(proxyClassName, clazz.getInterfaces());
		String paths = clazz.getResource(".").getPath();
		System.out.println(paths);
		
		FileOutputStream out = null;

		try {
			out = new FileOutputStream(paths + proxyClassName + ".class");
			out.write(classFile);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
