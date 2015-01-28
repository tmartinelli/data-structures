package br.com.tmartinelli.datastructures.linkedlist.test;

import br.com.tmartinelli.datastructures.linkedlist.LinkedList;

public class RemoveLastTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("Rafael");
		list.add("Paulo");
		
		list.removeLast();
		
		System.out.println(list);
	}
}
