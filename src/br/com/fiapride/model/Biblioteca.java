package br.com.fiapride.model;

public class Biblioteca {
	
	private String nome;
	private Livro livroDisponivel;
	
	
	public Biblioteca(String nome, Livro livroDisponivel) {
		this.nome = nome;
		this.livroDisponivel = livroDisponivel;
	}
	public void exibirResumo() {
		System.out.println("Biblioteca: " + this.nome);
		System.out.println("Livro disponível: "  + this.livroDisponivel.getTitulo());
		}
	
	public String getNome() {
		return this.nome;
	}
	public Livro getLivroDisponivel() {
		return this.livroDisponivel;
	}
}
