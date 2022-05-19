package com.ltu.creational.factorymethod;

public interface AbstractFactory<T, K> {
	T create(K type);
}
