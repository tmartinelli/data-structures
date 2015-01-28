package br.com.tmartinelli.datastructures.vector.test;

import java.util.ArrayList;

import br.com.tmartinelli.datastructures.vector.Student;
import br.com.tmartinelli.datastructures.vector.Vector;

public class ArrayListWithVectorTest {

	public static void main(String[] args) {
		Vector<Student> vector = new Vector<Student>();
		System.out.println(String.format("Vector size before: %s", vector.size()));
		for (int i = 0; i < 1000; i++) {
			vector.add(new Student());
		}
		System.out.println(String.format("Vector size after: %s", vector.size()));
		
		Vector<Student> vector2 = new Vector<Student>();
		System.out.println(String.format("Vector2 size before: %s", vector2.size()));
		for (int i = 0; i < vector.size(); i++) {
			vector2.add(vector.get(i));
		}
		System.out.println(String.format("Vector2 size after: %s", vector2.size()));
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		System.out.println(String.format("ArrayList size before: %s", arrayList.size()));
		for (int i = 0; i < vector.size(); i++) {
			arrayList.add(vector.get(i));
		}
		System.out.println(String.format("ArrayList size after: %s", arrayList.size()));
	}
}
