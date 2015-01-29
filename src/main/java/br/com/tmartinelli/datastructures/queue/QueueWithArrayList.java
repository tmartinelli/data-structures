package br.com.tmartinelli.datastructures.queue;

import java.util.ArrayList;
import java.util.List;

public class QueueWithArrayList<T> {

	private List<T> list = new ArrayList<T>();
	
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
