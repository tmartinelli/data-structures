package br.com.tmartinelli.datastructures.queue;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {

	private List<T> list = new LinkedList<T>();
	
	public void add(T element) {
		list.add(element);
	}
	
	public T remove() {
		return list.remove(0);
	}
	
	public boolean empty() {
		return list.isEmpty();
	}
}
