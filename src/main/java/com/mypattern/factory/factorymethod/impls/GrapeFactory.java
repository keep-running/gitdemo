package com.mypattern.factory.factorymethod.impls;

import com.mypattern.factory.factorymethod.Fruit;
import com.mypattern.factory.factorymethod.FruitGardener;

public class GrapeFactory implements FruitGardener{

	@Override
	public Fruit factory() {
		return new Grape();
	}

}
