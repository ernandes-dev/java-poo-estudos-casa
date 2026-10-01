package br.com.fiapride.model;

public class Autor {

    private String nome;
    private String generoLiterario;
    private int quantidadeDeLivros;

    public Autor(String nome, String generoLiterario, int quantidadeDeLivros) {

        this.nome = nome;
        this.generoLiterario = generoLiterario;
        this.setQuantidadeDeLivros(quantidadeDeLivros);

        System.out.println("Autor criado: " + this.nome
                + " | Gênero: " + this.generoLiterario
                + " | Livros: " + this.quantidadeDeLivros);
    }

    public String getNome() {
        return this.nome;
    }

    public String getGeneroLiterario() {
        return this.generoLiterario;
    }

    public int getQuantidadeDeLivros() {
        return this.quantidadeDeLivros;
    }

    private void setQuantidadeDeLivros(int quantidadeDeLivros) {

        if (quantidadeDeLivros >= 0) {
            this.quantidadeDeLivros = quantidadeDeLivros;
        } else {
            System.out.println("Erro: A quantidade de livros não pode ser negativa.");
        }
    }
}
