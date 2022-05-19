package com.ltu.creational.factorymethod;

public class FactoryMethodTest {
	public static void main(String[] args) {
		AbstractFactory abstractFactory;
        
        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Animal");
        Animal toy =(Animal) abstractFactory.create(AnimalType.DOG);
        
        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create(ColorType.BROWN);
        
        String result = "A " + toy.getAnimal() + " with " + color.getColor() + " color " + toy.makeSound();
        
        System.out.println(result);
	}
}
