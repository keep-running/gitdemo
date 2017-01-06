package com.mypattern.factory.factorymethod.impls;

import com.mypattern.factory.factorymethod.Fruit;
import com.mypattern.factory.factorymethod.FruitGardener;

public class AppleFactory implements FruitGardener{

	@Override
	public Fruit factory() {
		
		return new Apple();
	}

}
