package br.com.fiapride.model;

public class Livro {

    private String titulo;
    private int quantidadeDePaginas;
    private String generoLiterario;

    public Livro(String titulo, int quantidadeDePaginas, String generoLiterario) {
        this.setTitulo(titulo);
        this.setQuantidadeDePaginas(quantidadeDePaginas);
        this.setGeneroLiterario(generoLiterario);
    }

    public void adicionarPaginas(int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade de páginas é insuficiente.");
            return;
        }

        this.quantidadeDePaginas += quantidade;
        System.out.println("Quantidade de páginas adicionada com sucesso!");
    }

    public void removerPaginas(int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade informada é inválida.");
            return;
        }

        if (this.quantidadeDePaginas < quantidade) {
            System.out.println("Erro: Quantidade de páginas insuficiente para remover.");
            return;
        }

        this.quantidadeDePaginas -= quantidade;
        System.out.println("Quantidade removida com sucesso!");
    }

    public String getTitulo() {
        return this.titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadeDePaginas() {
        return this.quantidadeDePaginas;
    }

    private void setQuantidadeDePaginas(int quantidade) {
        if (quantidade >= 0) {
            this.quantidadeDePaginas = quantidade;
        } else {
            System.out.println("Erro: A quantidade de páginas não pode ser negativa.");
        }
    }

    public String getGeneroLiterario() {
        return this.generoLiterario;
    }

    private void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }
}