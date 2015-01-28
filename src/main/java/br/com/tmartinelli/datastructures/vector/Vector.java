package br.com.tmartinelli.datastructures.vector;


public class Vector<T> {

	private static final int INITIAL_SIZE = 100000;
	
	private Object[] elements = new Object[INITIAL_SIZE];
	private int size = 0;
	
	public void add(T element) {
		ensureSpace();
		elements[size++] = element;
	}
	
	public void add(int index, T element) {
		ensureSpace();
		if (!validPosition(index)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for (int i = size - 1; i >= index; i--) {
			elements[i + 1] = elements[i]; 
		}
		elements[index] = element;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (!busyPosition(index)) {
			throw new IllegalArgumentException("Invalid position");
		}
		return (T) elements[index];
	}
	
	public void remove(int index) {
		if (!busyPosition(index)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1]; 
		}
		size--;
	}
	
	public void removeAll(T element) {
		int newIndex = 0;
		for (int i = 0; i < size; i++) {
			if (!elements[i].equals(element)) {
				elements[newIndex++] = elements[i];
			}
		}
		
		for (int i = newIndex; i < size; i++) {
			elements[i] = null;
		}
		
		size = newIndex;
	}
	
	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
	}
	
	public boolean contains(T element) {
		for (int i = 0; i < size; i++) {
			if (element.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(T element) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(element)) {
				return i;
			}
		}
		throw new IllegalArgumentException("Element not found");
	}
	
	public int lastIndexOf(T element) {
		Integer lastIndex = null;
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(element)) {
				lastIndex = i;
			}
		}
		if (lastIndex == null) {
			throw new IllegalArgumentException("Element not found");
		}
		return lastIndex;
	}
	
	private boolean busyPosition(int index) {
		return index >= 0 && index < size;
	}
	
	private boolean validPosition(int index) {
		return index >= 0 && index <= size;
	}
	
	private void ensureSpace() {
		if (size == elements.length) {
			Object[] elementsAux = new Object[elements.length * 2];
			for (int i = 0; i < size - 1; i++) {
				elementsAux[i] = elements[i];
			}
			elements = elementsAux;
		}
	}
	
	@Override
	public String toString() {
		if (size == 0) return "[]";
		
		StringBuilder builder = new StringBuilder("[");
		
		for (int i = 0; i < size - 1; i++) {
			builder.append(elements[i]);
			builder.append(", ");
		}
		
		builder.append(elements[size - 1]);
		builder.append("]");
		
		return builder.toString();
	}
}
