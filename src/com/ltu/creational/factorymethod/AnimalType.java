package com.ltu.creational.factorymethod;

public enum AnimalType {
	DUCK("Duck"),
    DOG("Dog");

    private final String text;

    /**
     * @param text
     */
	AnimalType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
