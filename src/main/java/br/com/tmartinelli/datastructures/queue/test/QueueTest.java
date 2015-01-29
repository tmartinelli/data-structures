package br.com.tmartinelli.datastructures.queue.test;

import br.com.tmartinelli.datastructures.queue.Queue;
import br.com.tmartinelli.datastructures.vector.Student;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Student> students = new Queue<Student>();
		
		Student student = new Student();
		
		students.add(student);
		Student removedStudent = students.remove();
		
		if (students.empty()) {
			System.out.println("The queue is empty");
		}
		
		
		Queue<String> strings = new Queue<String>();
		strings.add("Adelaide");
		strings.add("Carolina");
		
		String adelaide = strings.remove();
		String carolina = strings.remove();
		
		System.out.println(adelaide);
		System.out.println(carolina);
	}
}
