package br.com.tmartinelli.datastructures.stack.test;

import br.com.tmartinelli.datastructures.stack.Cryptography;

public class CryptograhyTest {

	public static void main(String[] args) {
		String text = "Meu nome e Thiago";
		
		Cryptography cryptography = new Cryptography();
		
		String encryptedText = cryptography.encript(text);
		String decriptedText = cryptography.decript(encryptedText);
		
		System.out.println(encryptedText);
		System.out.println(decriptedText);
	}
}
