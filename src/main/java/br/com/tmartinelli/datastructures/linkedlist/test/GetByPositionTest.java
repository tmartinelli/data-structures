package br.com.tmartinelli.datastructures.linkedlist.test;

import br.com.tmartinelli.datastructures.linkedlist.LinkedList;

public class GetByPositionTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("Rafael");
		list.add("Paulo");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
}
