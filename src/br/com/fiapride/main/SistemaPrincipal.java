package br.com.fiapride.main;
import br.com.fiapride.model.Livro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro1 = new Livro();
		
		livro1.titulo = "O Hobbit";
		livro1.quantidadeDePaginas = 310;
		livro1.generoLiterario = "Fantasia";
		
		Livro livro2 = new Livro();
		
		livro2.titulo = "Scyhe";
		livro2.quantidadeDePaginas = 448;
		livro2.generoLiterario = "Ficção Científica";
		
		System.out.println("O livro " + livro1.titulo + " tem " + livro1.quantidadeDePaginas + " paginas ");
		System.out.println("Ja " + livro2.titulo + " tem " + livro2.quantidadeDePaginas + " paginas ");

	}

}

