package com.mypattern.proxy.generator;

import java.io.IOException;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;

public class MyGenerator {

	public static void main(String[] args)  {
		ClassPool pool = ClassPool.getDefault();
		
		CtClass cc = pool.makeClass("com.test.generator.HelloBean");
		
		try {
			CtMethod method = CtNewMethod.make("public void hi(){}", cc);
			
			method.insertBefore("System.out.println(\"hello world !!!\");");
			cc.addMethod(method);
//			String path = MyGenerator.class.getResource(".").getPath();
			String path1 = MyGenerator.class.getResource("/").getPath();
			cc.writeFile(path1);
		} catch (CannotCompileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
