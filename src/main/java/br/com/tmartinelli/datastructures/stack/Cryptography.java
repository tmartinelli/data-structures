package br.com.tmartinelli.datastructures.stack;

import java.util.Stack;

public class Cryptography {

	public String encript(String text) {
		return reverse(text);
	}
	
	public String decript(String text) {
		return reverse(text);
	}

	private String reverse(String text) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < text.length(); i++) {
			stack.push(text.charAt(i));
		}
		
		StringBuilder builder = new StringBuilder();
		while(!stack.empty()) {
			builder.append(stack.pop());
		}
		
		return builder.toString();
	}
}
