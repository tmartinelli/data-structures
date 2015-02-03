package br.com.tmartinelli.datastructures.map.test;

import java.util.HashMap;

import br.com.tmartinelli.datastructures.map.Car;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Car> map = new HashMap<String, Car>();
		map.put("abc1234", new Car("a"));
		System.out.println(map);
		map.put("abc1234", new Car("b"));
		System.out.println(map);
		map.put("abc1234", new Car("c"));
		System.out.println(map);
		
		System.out.println(map.containsKey("abc1234"));
		System.out.println(map.get("abc1234"));
		map.remove("abc1234");
		System.out.println(map);
	}
}
