package br.com.tmartinelli.datastructures.linkedlist.test;

import br.com.tmartinelli.datastructures.linkedlist.LinkedList;

public class AddFirstTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addFirst("Rafael");
		list.addFirst("Paulo");
		
		System.out.println(list);
	}
}
