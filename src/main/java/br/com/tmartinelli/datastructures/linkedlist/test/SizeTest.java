package br.com.tmartinelli.datastructures.linkedlist.test;

import br.com.tmartinelli.datastructures.linkedlist.LinkedList;

public class SizeTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("Rafael");
		list.add("Paulo");
		
		System.out.println(list.size());
		
		list.add("Camila");
		
		System.out.println(list.size());
	}
}
