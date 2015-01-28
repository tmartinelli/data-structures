package br.com.tmartinelli.datastructures.linkedlist;

public class LinkedList {

	private Cell first;
	private Cell last;
	private int size = 0;
	
	public void add(Object element) {
		if (size == 0) {
			addFirst(element);
		} else {
			Cell newCell = new Cell(element);
			newCell.setPrevious(last);
			last.setNext(newCell);
			last = newCell;
			size++;
		}
	}
	
	public void add(int index, Object element) {
		if (index == 0) {
			addFirst(element);
		} else if (index == size) {
			add(element);
		} else {
			Cell previous = getCell(index - 1);
			Cell next = previous.getNext();
			Cell newCell = new Cell(next, element);
			newCell.setPrevious(previous);
			previous.setNext(newCell);
			next.setPrevious(newCell);
			size++;
		}
	}
	
	public Object get(int index) {
		return getCell(index).getElement();
	}
	
	private Cell getCell(int index) {
		checkValidIndex(index);
		
		Cell actual = first;
		for(int i = 0; i < index; i++) {
			actual = actual.getNext();
		}
		return actual;
	}
	
	private void checkValidIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Invalid index");
		}
	}
	
	public void remove(int index) {
		checkValidIndex(index);
		
		if (index == 0) {
			removeFirst();
		} else if (index == size - 1) {
			removeLast();
		} else {
			Cell previous = getCell(index - 1);
			Cell actual = previous.getNext();
			Cell next = actual.getNext();
			previous.setNext(next);
			next.setPrevious(previous);
			size--;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean contains(Object element) {
		Cell actual = first;
		while(actual != null) {
			if (element.equals(actual.getElement())) {
				return true;
			}
			actual = actual.getNext();
		}
		return false;
	}
	
	public void addFirst(Object element) {
		if (size == 0) {
			Cell newCell = new Cell(element);
			first = newCell;
			last = newCell;
		} else {
			Cell newCell = new Cell(first, element);
			first.setPrevious(newCell);
			first = newCell;
		}
		size++;
	}
	
	public void removeFirst() {
		checkValidIndex(0);
		
		first = first.getNext();
		first.setPrevious(null);
		size--;
		
		if (size == 0) {
			last = null;
		}
	}
	
	public void removeLast() {
		checkValidIndex(size - 1);
		
		if (size == 1) {
			removeFirst();
		} else {
			Cell penultimate = last.getPrevious();
			penultimate.setNext(null);
			last = penultimate;
			size--;
		}
	}
	
	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		Cell actual = first;

		while(actual.getNext() != null) {
			builder.append(actual.getElement()).append(", ");
			actual = actual.getNext();
		}
		
		builder.append(actual.getElement()).append("]");

		return builder.toString();
	}
}
