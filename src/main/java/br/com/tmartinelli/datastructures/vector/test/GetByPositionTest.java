package br.com.tmartinelli.datastructures.vector.test;

import br.com.tmartinelli.datastructures.vector.Student;
import br.com.tmartinelli.datastructures.vector.Vector;

public class GetByPositionTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("Rafael");
		s2.setName("Paulo");
		
		Vector<Student> vector = new Vector<Student>();
		
		vector.add(s1);
		vector.add(s2);
		
		Student student1 = vector.get(0);
		Student student2 = vector.get(1);
		
		System.out.println(student1);
		System.out.println(student2);
	}
}
