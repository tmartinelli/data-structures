package br.com.tmartinelli.datastructures.set.test;

import br.com.tmartinelli.datastructures.set.Set;

public class SetPerformanceTest {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		
		Set<String> set = new Set<String>();
		
		for (int i = 0; i < 50000; i++) {
			set.add("palavra" + i);
		}

		for (int i = 0; i < 50000; i++) {
			set.contains("palavra" + i);
		}
		
		long end =  System.currentTimeMillis();
		
		System.out.println("Tempo: " + (end - begin) / 1000);
	}
}
