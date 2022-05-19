package com.ltu.creational.factorymethod;

public class AnimalFactory implements AbstractFactory<Animal, AnimalType> {

	@Override
    public Animal create(AnimalType type) {
        if (AnimalType.DOG.equals(type)) {
            return new Dog();
        } else if (AnimalType.DUCK.equals(type)) {
            return new Duck();
        }

        return null;
    }

	

}
