package com.ltu.creational.factorymethod;

public enum ColorType {
	WHITE("White"),
    BROWN("Brown");

    private final String text;

    /**
     * @param text
     */
    ColorType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
