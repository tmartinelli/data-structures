package br.com.tmartinelli.datastructures.stack.test;

import java.util.Stack;

import br.com.tmartinelli.datastructures.stack.Piece;

public class JavaStackTest {

	public static void main(String[] args) {
		Stack<Piece> stack = new Stack<Piece>();
		
		stack.push(new Piece("door"));
		Piece door = stack.pop();
		
		if (stack.empty()) {
			System.out.println("The stack is empty!");
		}
	}
}
