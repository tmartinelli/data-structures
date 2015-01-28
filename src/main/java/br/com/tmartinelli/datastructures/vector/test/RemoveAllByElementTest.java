package br.com.tmartinelli.datastructures.vector.test;

import br.com.tmartinelli.datastructures.vector.Student;
import br.com.tmartinelli.datastructures.vector.Vector;

public class RemoveAllByElementTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.setName("Rafael");
		s2.setName("Paulo");
		s3.setName("Rafael");
		s4.setName("Pedro");
		s5.setName("Rafael");
		
		Vector<Student> vector = new Vector<Student>();
		vector.add(s1);
		vector.add(s2);
		vector.add(s3);
		vector.add(s4);
		vector.add(s5);
		
		System.out.println(vector);
		System.out.println(vector.size());
		
		vector.removeAll(s1);
		
		System.out.println(vector);
		System.out.println(vector.size());
	}
}
