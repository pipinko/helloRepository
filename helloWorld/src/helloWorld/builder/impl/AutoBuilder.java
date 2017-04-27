package helloWorld.builder.impl;

import helloWorld.builder.Builder;
import helloWorld.builder.entity.Auto;

public class AutoBuilder implements Builder<Auto>{

	@Override
	public Auto build() {
		return new Auto("Ferari");
	}

}
