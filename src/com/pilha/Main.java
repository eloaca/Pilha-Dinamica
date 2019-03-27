package com.pilha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Criando as pilhas
		Pilha p1 = null;
		Pilha p2 = null;
		
		// Criando 2 pilha auxiliar
		Pilha aux = null;
		Pilha aux2 = null;
		
		// Scanner para a leitura de entrada de dados
		Scanner leitura = new Scanner (System.in);
		
		// Entrada dos dados
		System.out.println("Entre com a primeira palavra: ");
		String palavra1 = leitura.next();
		
		System.out.println("Entre com a segunda palavra: ");
		String palavra2 = leitura.next();
		
		// Try-catch
		try {
			// Instanciando a Pilha
			p1 = new Pilha ();
			p2 = new Pilha ();
			aux = new Pilha ();
			aux2 = new Pilha ();
			
			//Contador i
			int i;
			
			// Empilhar a palavra1 por caracter
			for (i = 0; i < palavra1.length(); i++) 
				p1.push(palavra1.charAt(i));
			
			// Empilhar a palavra2 por caracter
			for (i = 0; i < palavra2.length(); i++) 
				p2.push(palavra2.charAt(i));
			
			// Se as duas pilhas nao for do mesmo tamanho, nem entra na condição
			int cp1 = p1.size();
			int cp2 = p2.size();
			
			
			if (cp1 == cp2) {
				while (!p1.isEmpty()) {
					aux.push(p1.peek());
					p1.pop();
				}
				
				int caux = aux.size();
				
				for (i = 0; i < caux; i++) {
					char topo1 = (char) aux.peek();
					char topo2 = (char) p2.peek();
					
					if (topo1 == topo2) {
						p1.push(topo1);
						aux2.push(topo2);
						aux.pop();
						p2.pop();
					}
				}
				
				if (aux.isEmpty() == true) {
					System.out.println ("A palavra '"+palavra1+"' é o inverso da palavra '"+palavra2+"'");
					System.exit(0);
				}
			} 
			System.out.println("As palavras '"+palavra1+"' e '"+palavra2+ "' nao sao inversas");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}