package br.com.tmartinelli.datastructures.vector.test;

import br.com.tmartinelli.datastructures.vector.Student;
import br.com.tmartinelli.datastructures.vector.Vector;

public class IndexOfTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setName("Rafael");
		s2.setName("Paulo");
		s3.setName("Rafael");
		
		Vector<Student> vector = new Vector<Student>();
		vector.add(s1);
		vector.add(s2);
		vector.add(s3);
		
		System.out.println("S1 first index:" + vector.indexOf(s1));
		System.out.println("S2 first index:" + vector.indexOf(s2));
		System.out.println("S3 first index:" + vector.indexOf(s3));
	}
}
