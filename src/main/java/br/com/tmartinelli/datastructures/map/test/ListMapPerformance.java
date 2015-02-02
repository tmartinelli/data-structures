package br.com.tmartinelli.datastructures.map.test;

import br.com.tmartinelli.datastructures.map.Car;
import br.com.tmartinelli.datastructures.map.ListMap;

public class ListMapPerformance {

	public static void main(String[] args) {
		ListMap listMap = new ListMap();

		int elementNumbers = 15000;
		
		long begin = System.currentTimeMillis();
		
		for (int i = 0; i < elementNumbers; i++) {
			listMap.add("" + i, new Car("c" + i));
		}
		
		for (int i = 0; i < elementNumbers; i++) {
			listMap.get("" + i);
		}
		
		for (int i = 0; i < elementNumbers; i++) {
			listMap.containKey("" + i);
		}
		
		for (int i = 0; i < elementNumbers; i++) {
			listMap.remove("" + i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (end - begin));
	}
}
