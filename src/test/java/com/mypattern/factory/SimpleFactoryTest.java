package com.mypattern.factory;

import org.junit.Test;

import com.mypattern.factory.simple.BadFruitException;
import com.mypattern.factory.simple.Fruit;
import com.mypattern.factory.simple.FruitGardener;

public class SimpleFactoryTest {
	
	@Test
	public void fruitFactoryTest() throws BadFruitException{
		Fruit fruit = FruitGardener.factory("apple");
		fruit.grow();
		fruit = FruitGardener.factory("grape");
		fruit.grow();
	}

}
