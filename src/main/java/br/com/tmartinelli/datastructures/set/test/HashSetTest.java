package br.com.tmartinelli.datastructures.set.test;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Rafael");
		set.add("Rafael");
		set.add("Ana");
		set.add("Paulo");
		System.out.println(set);
	}
}
