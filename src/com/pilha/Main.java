package com.pilha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Criando as pilhas
		Pilha p1 = null;

		// Scanner para a leitura de entrada de dados
		Scanner leitura = new Scanner (System.in);
		
		// Entrada dos dados
		System.out.println("Entre com a primeira palavra: ");
		String palavra1 = leitura.next();
		
		// Try-catch
		try {
			// Instanciando a Pilha
			p1 = new Pilha ();

			//Contador i
			int i;
			
			// Empilhar a palavra1 por caracter
			for (i = 0; i < palavra1.length(); i++) 
				p1.push(palavra1.charAt(i));
			
			// Imprimir a pilha de palavras
			
			System.out.println ("Esta é sua pilha de palavras: ");
			while (!p1.isEmpty()){
				System.out.println ("" +p1.peek());
				p1.pop();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
}
