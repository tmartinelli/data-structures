package br.com.tmartinelli.datastructures.set.test;

import br.com.tmartinelli.datastructures.set.Set;

public class SetWith100ElementsTest {

	public static void main(String[] args) {
		Set<String> set = new Set<String>();
		
		for (int i = 0; i < 100; i++) {
			set.add("" + i);
		}
		
		set.printTable();
	}
}
