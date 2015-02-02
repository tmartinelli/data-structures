package br.com.tmartinelli.datastructures.set.test;

import java.util.List;

import br.com.tmartinelli.datastructures.set.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> vocabulary = new Set<String>();
		vocabulary.add("apostila");
		vocabulary.add("instrutor");
		vocabulary.add("aula");
		vocabulary.add("aula");
		
		List<String> all = vocabulary.getAll();
		
		System.out.println("Before removing");
		System.out.println("Size: " + vocabulary.size());
		for (Object name : all) {
			System.out.println(name);
		}
		
		vocabulary.remove("apostila");
		
		all = vocabulary.getAll();
		
		System.out.println("After removing");
		System.out.println("Size: " + vocabulary.size());
		for (Object name : all) {
			System.out.println(name);
		}
		
		System.out.println(vocabulary.contains("aula"));
		System.out.println(vocabulary.contains("ebook"));
	}
}
