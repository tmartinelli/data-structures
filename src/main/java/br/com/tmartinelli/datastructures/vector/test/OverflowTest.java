package br.com.tmartinelli.datastructures.vector.test;

import br.com.tmartinelli.datastructures.vector.Student;
import br.com.tmartinelli.datastructures.vector.Vector;

public class OverflowTest {

	public static void main(String[] args) {
		Vector<Student> vector = new Vector<Student>();
		for (int i = 0; i < 100001; i ++) {
			vector.add(new Student());
		}
	}
}
