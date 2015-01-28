package br.com.tmartinelli.datastructures.vector.test;

import java.util.ArrayList;

import br.com.tmartinelli.datastructures.vector.Student;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Student> vector = new ArrayList<Student>();
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.setName("Joao");
		student2.setName("Rafael");
		student3.setName("Paulo");
		
		vector.add(student1);
		vector.add(student2);
		vector.add(0, student3);
		
		int size = vector.size();
		
		if (size != 3) {
			System.out.println("Error: The list size is wrong.");
		}
		
		if (!vector.contains(student1)) {
			System.out.println("Error: A student who should be in the list not was found.");
		}
		
		vector.remove(0);
		size = vector.size();
		
		if (size != 2) {
			System.out.println("Error: The list size is wrong.");
		}
		
		if (vector.contains(student3)) {
			System.out.println("Errors: A student who should not be in the list was found.");
		}
	}
}
