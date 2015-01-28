package br.com.tmartinelli.datastructures.linkedlist.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceTest {

	public static void main(String[] args) {
		ArrayList<String> vector = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		
		int elementsNumber = 40000;

		//Adding first
		long begin = System.currentTimeMillis();
		for (int i = 0; i < elementsNumber; i++) {
			vector.add(0, "" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time to adding " + elementsNumber + " elements in vector: " + (end - begin));
		
		begin = System.currentTimeMillis();
		for (int i = 0; i < elementsNumber; i++) {
			linkedList.add(0, "" + i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time to adding " + elementsNumber + " elements in linked list: " + (end - begin));
		
		
		//Traversing
		begin = System.currentTimeMillis();
		for (int i = 0; i < elementsNumber; i++) {
			vector.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time to traversing " + elementsNumber + " elements through vector: " + (end - begin));
		
		begin = System.currentTimeMillis();
		for (int i = 0; i < elementsNumber; i++) {
			linkedList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time to traversing " + elementsNumber + " elements through linked list: " + (end - begin));
		
		
		//Removing first
		begin = System.currentTimeMillis();
		for (int i = 0; i < elementsNumber; i++) {
			vector.remove(0);
		}
		end = System.currentTimeMillis();
		System.out.println("Time to removing " + elementsNumber + " elements from vector: " + (end - begin));
		
		//Removing first
		begin = System.currentTimeMillis();
		for (int i = 0; i < elementsNumber; i++) {
			linkedList.remove(0);
		}
		end = System.currentTimeMillis();
		System.out.println("Time to removing " + elementsNumber + " elements from linked list: " + (end - begin));
	}
}
