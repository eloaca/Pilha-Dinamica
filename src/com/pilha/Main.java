package com.pilha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		// Criando as pilhas
		Pilha p1 	= new Pilha();
		Pilha p2 	= new Pilha();
		Pilha aux 	= new Pilha();
		
		p1.push("f");
		p1.push("a");
		p1.push("c");
		p1.push("e");

		// Scanner para a leitura de entrada de dados
		Scanner leitura = new Scanner (System.in);
		
		// Quantidade de visitantes
		int v = 0;
		
		// Contador do laço while
		int x = 0;
		
		System.out.println ("Olá.\nQuantos visitantes irão participar ?");
		v = leitura.nextInt();
		
		while (x != v) {
			// Entrada dos dados
			System.out.println("Entre com a palavra "+x+ ": ");
			String palavra = leitura.next();
				
			//Contador i
			int i;
			
			p1.push(" "); 
			
			// Empilhar a palavra1 por caracter
			for (i = 0; i < palavra.length(); i++) { 
				p1.push(palavra.charAt(i));
			}
				
			x++;
		} // final while
		
		int letras = 0;
		
		String topop1 = null;
		String topop2 = null;
		
		for (int i = 0; i < v; i++) {
			while (p1.peek() != " ") {
				topop1 = p1.peek().toString();
				p2.push(p1.peek());
				p1.pop();
			}
			
			if (p1.peek().toString().equals(" "))
				p1.pop();
			
			topop1 = p1.peek().toString();
			topop2 = p2.peek().toString();
				
			if (p1.isEmpty() == false) {
				if (topop1.equals(topop2)) {
					p2.pop();
					aux.push(topop1);
					p1.pop();
					letras++;
					
					topop1 = p1.peek().toString();
					
					if (!p2.isEmpty())
						topop2 = p2.peek().toString();					
				}
				else {
					while (!p2.isEmpty())
						p2.pop();
				}
			}
			
			if (aux.isEmpty() == false) {
				while (!aux.isEmpty()) {
					p1.push(aux.peek());
					aux.pop();
					
				} // fim do while
			} // fim do if
			
		} // fim do laco for
		
		System.out.println("Ola. Ganharam brindes: "+letras);
	}
}
		
		