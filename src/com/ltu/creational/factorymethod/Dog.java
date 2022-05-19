package com.ltu.creational.factorymethod;

public class Dog implements Animal {

	@Override
	public String getAnimal() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "Bake";
	}

}
