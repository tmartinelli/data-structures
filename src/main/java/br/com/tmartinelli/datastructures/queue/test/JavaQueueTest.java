package br.com.tmartinelli.datastructures.queue.test;

import java.util.LinkedList;
import java.util.Queue;

import br.com.tmartinelli.datastructures.vector.Student;

public class JavaQueueTest {

	public static void main(String[] args) {
		Queue<Student> queue = new LinkedList<Student>();
		
		Student student = new Student();
		queue.offer(student);
		
		Student removedStudent = queue.poll();
		
		if (queue.isEmpty()) {
			System.out.println("The queue is empty");
		}
	}
}
