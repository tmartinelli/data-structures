package br.com.tmartinelli.datastructures.map;

public class Association {

	private String licensePlate;
	private Car car;

	public Association(String licensePlate, Car car) {
		this.licensePlate = licensePlate;
		this.car = car;
	}

	public String getLicensePlate() {
		return licensePlate;
	}
	
	public Car getCar() {
		return car;
	}
}
