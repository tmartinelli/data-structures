package br.com.tmartinelli.datastructures.queue.test;

import br.com.tmartinelli.datastructures.queue.Queue;
import br.com.tmartinelli.datastructures.queue.QueueWithArrayList;
import br.com.tmartinelli.datastructures.vector.Student;

public class QueuePerformanceTest {

	public static void main(String[] args) {
		Queue<Student> queueUsingLinkedList = new Queue<Student>();
		QueueWithArrayList<Student> queueUsingArrayList = new QueueWithArrayList<Student>();
		
		int elementNumber = 100000;
		
		long begin = System.currentTimeMillis();
		for (int i = 0; i < elementNumber; i++) {
			queueUsingLinkedList.add(new Student());
		}
		long end = System.currentTimeMillis();

		System.out.println("Adding into linked list queue: " + (end - begin));
		
		
		begin = System.currentTimeMillis();
		while (!queueUsingLinkedList.empty()) {
			queueUsingLinkedList.remove();
		}
		end = System.currentTimeMillis();
		
		System.out.println("Removing from linked list queue: " + (end - begin));
		
		
		begin = System.currentTimeMillis();
		for (int i = 0; i < elementNumber; i++) {
			queueUsingArrayList.add(new Student());
		}
		end = System.currentTimeMillis();
		
		System.out.println("Adding into array list queue: " + (end - begin));
		
		
		begin = System.currentTimeMillis();
		while (!queueUsingArrayList.empty()) {
			queueUsingArrayList.remove();
		}
		end = System.currentTimeMillis();
		
		System.out.println("Removing from array list queue: " + (end - begin));
	}
}
