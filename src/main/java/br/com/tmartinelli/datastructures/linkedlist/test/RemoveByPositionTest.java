package br.com.tmartinelli.datastructures.linkedlist.test;

import br.com.tmartinelli.datastructures.linkedlist.LinkedList;

public class RemoveByPositionTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("Rafael");
		list.add("Paulo");
		list.add("Camila");
		
		list.remove(1);
		
		System.out.println(list);
	}
}
