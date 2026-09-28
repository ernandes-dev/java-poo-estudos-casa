package br.com.fiapride.main;

import br.com.fiapride.model.Livro;

public class TesteMeuLivro {

    public static void main(String[] args) {

        Livro livro1 = new Livro("O Hobbit", 310, "Fantasia");

        Livro livro2 = new Livro("Scythe", 448, "Ficção Científica");

        System.out.println("O livro " + livro1.getTitulo() + " tem "
                + livro1.getQuantidadeDePaginas() + " paginas.");

        System.out.println("Ja " + livro2.getTitulo() + " tem "
                + livro2.getQuantidadeDePaginas() + " paginas.");

        System.out.println("\n--- TESTANDO MÉTODOS ---");

        // Teste válido
        livro1.adicionarPaginas(50);

        System.out.println("Paginas após adicionar: "
                + livro1.getQuantidadeDePaginas());

        // Teste inválido
        livro1.adicionarPaginas(-20);

        // Teste válido
        livro1.removerPaginas(100);

        System.out.println("Paginas após remover: "
                + livro1.getQuantidadeDePaginas());

        // Teste inválido
        livro1.removerPaginas(500);
    }
}

