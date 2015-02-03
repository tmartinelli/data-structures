package br.com.tmartinelli.datastructures.map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Map<K, V> {

	private List<List<Association<K, V>>> table = new ArrayList<List<Association<K, V>>>();
	private int size = 0;
	
	public Map() {
		for (int i = 0; i < 100; i++) {
			table.add(new LinkedList<Association<K, V>>());
		}
	}
	
	private int calculateTableIndex(K key) {
		return Math.abs(key.hashCode()) % table.size();
	}
	
	public boolean containKey(K key) {
		int index = calculateTableIndex(key);
		List<Association<K, V>> list = table.get(index);
		for (Association<K, V> association : list) {
			if (key.equals(association.getKey())) {
				return true;
			}
		}
		return false;
	}
	
	public void remove(K key) {
		int index = calculateTableIndex(key);
		List<Association<K, V>> list = table.get(index);
		for (int i = 0; i < list.size(); i++) {
			Association<K, V> association = list.get(i);
			if (key.equals(association.getKey())) {
				list.remove(i);
				size--;
				checkCharge();
				return;
			}
		}
		throw new IllegalArgumentException("Key does not exist");
	}
	
	public void put(K key, V value) {
		checkCharge();
		
		if (containKey(key)) {
			remove(key);
		}
		
		int index = calculateTableIndex(key);
		List<Association<K, V>> list = table.get(index);
		list.add(new Association<K, V>(key, value));
		size++;
	}
	
	public V get(K key) {
		int index = calculateTableIndex(key);
		List<Association<K, V>> list = table.get(index);
		for (Association<K, V> association : list) {
			if (key.equals(association.getKey())) {
				return association.getValue();
			}
		}
		throw new IllegalArgumentException("Key does not exist");
	}
	
	public List<Association<K, V>> getAll() {
		List<Association<K, V>> all = new ArrayList<Association<K,V>>();
		for (int i = 0; i < table.size(); i++) {
			List<Association<K, V>> list = table.get(i);
			all.addAll(list);
		}
		return all;
	}
	
	public int size() {
		return size;
	}
	
	private void checkCharge() {
		int tableSize = table.size();
		double capacity = (double) size / tableSize;
		
		if (capacity > 0.75) {
			resizeTable(tableSize * 2);
		} else if (capacity < 0.15) {
			resizeTable(Math.max(tableSize / 2, 10));
		}
	}

	private void resizeTable(int newSize) {
		List<Association<K,V>> all = getAll();
		table.clear();
		
		for (int i = 0; i < newSize; i++) {
			table.add(new LinkedList<Association<K,V>>());
		}
		
		for (Association<K, V> association : all) {
			put(association.getKey(), association.getValue());
		}
	}
	
	@Override
	public String toString() {
		return getAll().toString();
	}
}
