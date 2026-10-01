package br.com.fiapride.main;

import br.com.fiapride.model.LivroFisico;
import br.com.fiapride.model.Autor;
import br.com.fiapride.model.Ebook;


public class SistemaPrincipal {

    public static void main(String[] args) {
    	
    	System.out.println("--- Teste  ---");
    	
    	Autor autor2 = new Autor("Neal Shusterman", "Ficção Científica", 20);
    	
    	Ebook kindle = new Ebook(80, "Scythe", 448, "Ficção Científica", autor2);
    	
    	LivroFisico capaDura = new LivroFisico(1000, "Thunderhead", 512, "Distopia", autor2);

        System.out.println("\n--- EBOOK ---");

        System.out.println("Título: " + kindle.getTitulo());
        System.out.println("Páginas: " + kindle.getQuantidadeDePaginas());
        System.out.println("Gênero: " + kindle.getGeneroLiterario());
        System.out.println("Autor: " + kindle.getAutor().getNome());
        System.out.println("Tamanho do arquivo: "
                + kindle.getTamanhoArquivoMB() + " MB");

        System.out.println("\n--- LIVRO FÍSICO ---");

        System.out.println("Título: " + capaDura.getTitulo());
        System.out.println("Páginas: " + capaDura.getQuantidadeDePaginas());
        System.out.println("Gênero: " + capaDura.getGeneroLiterario());
        System.out.println("Autor: " + capaDura.getAutor().getNome());
        System.out.println("Peso: "
                + capaDura.getPesoGramas() + " g");
    }
}