package com.mypattern.factory.simple;

import com.mypattern.factory.simple.impls.Apple;
import com.mypattern.factory.simple.impls.Grape;
import com.mypattern.factory.simple.impls.Strawberry;

public class FruitGardener {

	public static Fruit factory(String whichFruit) throws BadFruitException {
		if (whichFruit.equalsIgnoreCase("apple")) {
			return new Apple();
		} else if (whichFruit.equalsIgnoreCase("strawberry")) {
			return new Strawberry();
		} else if (whichFruit.equalsIgnoreCase("grape")) {
			return new Grape();
		} else {
			throw new BadFruitException("bad fruit request");
		}
	}
}
