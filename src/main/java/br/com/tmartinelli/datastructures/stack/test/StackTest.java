package br.com.tmartinelli.datastructures.stack.test;

import br.com.tmartinelli.datastructures.stack.Piece;
import br.com.tmartinelli.datastructures.stack.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Piece> stack = new Stack<Piece>();
		
		Piece door = new Piece("door");
		stack.push(door);
		
		Piece removedPiece = stack.pop();
		
		if (stack.empty()) {
			System.out.println("The stack is empty!");
		}
		
		Stack<String> stack2 = new Stack<String>();
		stack2.push("Alberto");
		stack2.push("Maria");
		
		String maria = stack2.pop();
		String alberto = stack2.pop();
		
		System.out.println(maria);
		System.out.println(alberto);
	}
}
