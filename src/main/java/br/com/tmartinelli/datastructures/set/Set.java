package br.com.tmartinelli.datastructures.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Set<T> {

	List<List<T>> table = new ArrayList<List<T>>();
	private int size = 0;
	
	public Set() {
		for (int i = 0; i < 26; i++) {
			List<T> list = new LinkedList<T>();
			table.add(list);
		}
	}
	
	public void add(T element) {
		if (!contains(element)) {
			checkCharge();
			int index = calculateTableIndex(element);
			List<T> list = table.get(index);
			list.add(element);
			size++;
		}
	}
	
	public void remove(T element) {
		if (contains(element)) {
			int index = calculateTableIndex(element);
			List<T> list = table.get(index);
			list.remove(element);
			size--;
			checkCharge();
		}
	}
	
	public boolean contains(T element) {
		int index = calculateTableIndex(element);
		List<T> list = table.get(index);
		return list.contains(element);
	}
	
	public List<T> getAll() {
		List<T> all = new ArrayList<T>();
		for (List<T> list : table) {
			all.addAll(list);
		}
		return all;
	}
	
	public int size() {
		return size;
	}
	
//	private int calculateMirroringCode(String word) {
//		int code = 1;
//		for (int i = 0; i < word.length(); i++) {
//			code = 31 * code + word.charAt(i);
//		}
//		return code;
//	}
	
	private int calculateTableIndex(T element) {
		int mirroringCode = element.hashCode();
		mirroringCode = Math.abs(mirroringCode);
		return mirroringCode % table.size();
	}
	
	private void resizeTable(int newSize) {
		List<T> list = getAll();
		table.clear();
		
		for (int i = 0; i < newSize; i++) {
			table.add(new LinkedList<T>());
		}
		
		for (T element : list) {
			add(element);
		}
	}

	public void checkCharge() {
		int tableSize = table.size();
		double charge = (double) size / tableSize; 
		
		if (charge > 0.75) {
			resizeTable(tableSize * 2);
		}
		if (charge < 0.25) {
			resizeTable(Math.max(tableSize / 2, 10));
		}
		
	}
	
	public void printTable() {
		for (List<T> list : table) {
			System.out.print("[");
			for (int i = 0; i < list.size(); i++) {
				System.out.print("*");
			}
			System.out.println("]");
		}
	}
}
