package com.ltu.structure.bridge;

public abstract class Shape {
	protected Color color;
    
    //standard constructors
	public Shape(Color color) {
        this.color = color;
    }
    
    abstract public String draw();
}
