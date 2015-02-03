package br.com.tmartinelli.datastructures.map;

public class Association<K, V> {

	private K key;
	private V value;

	public Association(K licensePlate, V car) {
		this.key = licensePlate;
		this.value = car;
	}

	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
