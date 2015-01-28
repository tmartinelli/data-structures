package br.com.tmartinelli.datastructures.vector.test;

import br.com.tmartinelli.datastructures.vector.Student;
import br.com.tmartinelli.datastructures.vector.Vector;

public class Add100000StudentsTest {

	public static void main(String[] args) {
		Vector<Student> vector = new Vector<Student>();
		long initTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			vector.add(new Student());
		}
		long endTime = System.currentTimeMillis();
		System.out.println(String.format("Spend time: %s", endTime - initTime));
	}
}
