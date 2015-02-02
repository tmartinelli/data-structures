package br.com.tmartinelli.datastructures.map;

import java.util.ArrayList;
import java.util.List;

public class ListMap {

	private List<Association> associations = new ArrayList<Association>();
	
	public void add(String licensePlate, Car car) {
		if (!containKey(licensePlate)) {
			Association association = new Association(licensePlate, car);
			associations.add(association);
		}
	}
	
	public void remove(String licensePlate) {
		if (containKey(licensePlate)) {
			for (int i = 0; i < associations.size(); i++) {
				Association association = associations.get(i);
				if (licensePlate.equals(association.getLicensePlate())) {
					associations.remove(i);
				}
			}
		} else {
			throw new IllegalArgumentException("Key does not exist");
		}
	}
	
	public Car get(String licensePlate) {
		for (Association association : associations) {
			if (licensePlate.equals(association.getLicensePlate())) {
				return association.getCar();
			}
		}
		throw new IllegalArgumentException("Key does not exist");
	}
	
	public boolean containKey(String licensePlate) {
		for (Association association : associations) {
			if (licensePlate.equals(association.getLicensePlate())) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return associations.size();
	}
}
