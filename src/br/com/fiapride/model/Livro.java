package br.com.fiapride.model;

public class Livro {
	public String titulo;
	public int quantidadeDePaginas;
	public String generoLiterario;


	public void adicionarPaginas(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Erro: A quantidade de paginas é insuficente."); 
		return;
	}
	this.quantidadeDePaginas += quantidade;
	System.out.println("Quantidade de paginas realizadas com sucesso!");
}
	public void removerPaginas(int quantidade) {

	    if (quantidade <= 0) {
	        System.out.println("Erro: Não tem pagina o suficiente no livro!");
	        return;
	    }
	    if (this.quantidadeDePaginas < quantidade) {
	    	System.out.println("Erro:Quantidade de paginas insuficiente para remover.");
	    	return;
	    }

	    this.quantidadeDePaginas -= quantidade;

	    System.out.println("Quantidade removida com sucesso!");
	}
}