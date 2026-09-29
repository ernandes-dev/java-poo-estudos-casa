package br.com.fiapride.main;

import br.com.fiapride.model.Autor;

public class TesteAutor {

    public static void main(String[] args) {

        Autor autor1 = new Autor(
                "J. R. R. Tolkien",
                "Fantasia",
                20
        );

        Autor autor2 = new Autor(
                "Autor Teste",
                "Fantasia",
                -5
        );
    }
}