package br.com.tmartinelli.datastructures.map;

import java.util.ArrayList;
import java.util.List;

public class ListMap<K, V> {

	private List<Association<K, V>> associations = new ArrayList<Association<K, V>>();
	
	public void put(K key, V value) {
		if (!containKey(key)) {
			Association<K, V> association = new Association<K, V>(key, value);
			associations.add(association);
		}
	}
	
	public void remove(K key) {
		if (containKey(key)) {
			for (int i = 0; i < associations.size(); i++) {
				Association<K, V> association = associations.get(i);
				if (key.equals(association.getKey())) {
					associations.remove(i);
				}
			}
		} else {
			throw new IllegalArgumentException("Key does not exist");
		}
	}
	
	public V get(K key) {
		for (Association<K, V> association : associations) {
			if (key.equals(association.getKey())) {
				return association.getValue();
			}
		}
		throw new IllegalArgumentException("Key does not exist");
	}
	
	public boolean containKey(K key) {
		for (Association<K, V> association : associations) {
			if (key.equals(association.getKey())) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return associations.size();
	}
}
