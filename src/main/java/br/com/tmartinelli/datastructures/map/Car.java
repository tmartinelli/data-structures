package br.com.tmartinelli.datastructures.map;

public class Car {

	private String name;
	
	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Carro: " + name;
	}
}
