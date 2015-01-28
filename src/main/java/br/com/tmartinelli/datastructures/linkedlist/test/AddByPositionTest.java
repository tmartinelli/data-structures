package br.com.tmartinelli.datastructures.linkedlist.test;

import br.com.tmartinelli.datastructures.linkedlist.LinkedList;

public class AddByPositionTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("Rafael");
		list.add(0, "Paulo");
		list.add(1, "Camila");
		
		System.out.println(list);
	}
}
