package br.com.tmartinelli.datastructures.vector.test;

import br.com.tmartinelli.datastructures.vector.Student;
import br.com.tmartinelli.datastructures.vector.Vector;

public class ContainsAStudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("Rafael");
		s2.setName("Paulo");
		
		Vector<Student> vector = new Vector<Student>();
		
		vector.add(s1);
		vector.add(s2);
		
		System.out.println(vector.contains(s1));
		System.out.println(vector.contains(s2));
		
		Student student = new Student();
		student.setName("Ana");
		
		System.out.println(vector.contains(student));
	}
}
