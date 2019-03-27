package com.pilha;

public class Pilha<TipoItem> {
	
	private class No {
		private TipoItem item;
		private No proximo;

		public No(TipoItem item, No proximo) {
			this.item = item;
			this.proximo = proximo;
		}

		public TipoItem getItem() {
			return this.item;
		}

		public No getProximo() {
			return this.proximo;
		}

		public void setItem(TipoItem item) {
			this.item = item;
		}

		public void setProximo(No proximo) {
			this.proximo = proximo;
		}
	} // fim da classe No

	// Topo: Primeiro elemento da pilha
	private No primeiro;
	
	public Pilha() throws Exception {
		this.primeiro = null;
	}

	/**
	 * Essa funcao tem como objetivo adicionar um elemento ao topo da pilha
	 * @param item A ser adicionado na pilha
	 * @throws Exception
	 */
	public void push(TipoItem item) throws Exception {
		if (item == null)
			throw new Exception("Valor ausente");
		
        this.primeiro = new No (item, this.primeiro);
	}

	
	/**
	 * Esta funcao tem como objetivo remover o ultimo elemento adicionado
	 * na pilha
	 * @throws Exception
	 */
	public void pop() throws Exception {
		if (this.isEmpty())
			throw new Exception("Nada guardado");
		
        this.primeiro = this.primeiro.getProximo();
	}

	/**
	 * Peek: Esta funcao tem como objetivo retorna o ultimo elemento adicionado
	 * na pilha, ou seja, retorna o topo da pilha
	 * @return o ultimo elemento adicionado na pilha: o topo
	 */
	public TipoItem peek() throws Exception {
		if (this.isEmpty())
			throw new Exception("Nada guardado");

		return this.primeiro.getItem();
	}

	/**
	 * isEmpty: Esta funcao verifica se a pilha esta vazia
	 * @return true se estiver vazia, false caso nao.
	 */
	public boolean isEmpty() {
		return this.primeiro == null;
	}
	
	/**
	 * Size: Esta funcao tem como objetivo contar quantos elementos
	 * estão armazenados na pilha, no momento da consulta.
	 * @return contador: tamanho da pilha
	 */
	public int size () {
		No p = this.primeiro;
		int contador = 0;        
        while (p != null) {
            p = p.getProximo();
            contador++;
        }
    return contador;
	}
	
}