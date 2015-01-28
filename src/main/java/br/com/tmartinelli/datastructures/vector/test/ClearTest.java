package br.com.tmartinelli.datastructures.vector.test;

import br.com.tmartinelli.datastructures.vector.Student;
import br.com.tmartinelli.datastructures.vector.Vector;

public class ClearTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("Rafael");
		s2.setName("Paulo");
		
		Vector<Student> vector = new Vector<Student>();
		vector.add(s1);
		vector.add(s2);
		
		System.out.println("Vector size: " + vector.size());

		vector.clear();
		
		System.out.println("Vector size: " + vector.size());
		
		vector.add(s2);
		System.out.println("Vector size: " + vector.size());
	}
}
