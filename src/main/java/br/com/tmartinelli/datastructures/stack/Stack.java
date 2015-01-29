package br.com.tmartinelli.datastructures.stack;

import java.util.LinkedList;


public class Stack<T> {

	private LinkedList<T> list = new LinkedList<T>();
	
	public void push(T element) {
		list.add(element);
	}
	
	public T pop() {
		return list.removeLast();
	}
	
	public boolean empty() {
		return list.isEmpty();
	}
}
