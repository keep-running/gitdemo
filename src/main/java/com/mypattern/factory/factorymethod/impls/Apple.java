package com.mypattern.factory.factorymethod.impls;

import com.mypattern.factory.factorymethod.Fruit;

public class Apple implements Fruit {
	private int treeAge;

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

	@Override
	public void grow() {
		log("apple is growing ...");

	}

	@Override
	public void harvest() {
		log("Apple has been harvested.");
	}

	@Override
	public void plant() {
		log("Apple has been planted.");
	}
	
	public static void log(String msg)
	{
		System.out.println(msg);
	}

}
