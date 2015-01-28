package br.com.tmartinelli.datastructures.linkedlist.test;

import br.com.tmartinelli.datastructures.linkedlist.LinkedList;
import br.com.tmartinelli.datastructures.vector.Student;

public class LinkedListAPITest {

	public static void main(String[] args) {
		Student maria = new Student();
		maria.setName("Maria");
		
		Student manoel = new Student();
		manoel.setName("Manoel");
		
		Student joaquim = new Student();
		joaquim.setName("Joaquim");
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(maria);
		linkedList.add(manoel);
		linkedList.add(1, joaquim);
		
		System.out.println(linkedList);
	}
}
