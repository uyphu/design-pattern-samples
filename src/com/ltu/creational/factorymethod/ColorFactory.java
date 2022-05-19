package com.ltu.creational.factorymethod;

public class ColorFactory implements AbstractFactory<Color, ColorType>{
	public Color create(ColorType colorType) {
        if (ColorType.BROWN.equals(colorType)) {
            return new Brown();
        } else if (ColorType.BROWN.equals(colorType)) {
            return new White();
        }

        return null;
    }
}
