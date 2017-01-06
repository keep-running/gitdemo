package com.mypattern.factory.factorymethod.impls;

import com.mypattern.factory.factorymethod.Fruit;
import com.mypattern.factory.factorymethod.FruitGardener;

public class StrawberryFactory implements FruitGardener{

	@Override
	public Fruit factory() {
		return new Strawberry();
	}

}
