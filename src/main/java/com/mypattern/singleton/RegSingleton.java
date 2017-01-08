package com.mypattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class RegSingleton {
	static private Map<String, RegSingleton> instancesMap = new HashMap<>();
	static {
		RegSingleton instance = new RegSingleton();
		instancesMap.put(RegSingleton.class.getName(), instance);
	}

	private RegSingleton() {
		// TODO Auto-generated constructor stub
	}
	public static RegSingleton getInstance(String name){
		if (name == null){
			name = RegSingleton.class.getName();
		}
		if (instancesMap.get(name) == null){
			try {
				instancesMap.put(name, (RegSingleton) Class.forName(name).newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return instancesMap.get(name);
	}
}
