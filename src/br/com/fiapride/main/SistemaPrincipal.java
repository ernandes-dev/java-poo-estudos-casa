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
		
		livro2.titulo = "Scythe";
		livro2.quantidadeDePaginas = 448;
		livro2.generoLiterario = "Ficção Científica";
		
		System.out.println("O livro " + livro1.titulo + " tem " + livro1.quantidadeDePaginas + " paginas ");
		System.out.println("Ja " + livro2.titulo + " tem " + livro2.quantidadeDePaginas + " paginas ");
		
		livro1.adicionarPaginas(50);

		System.out.println("Agora o livro " + livro1.titulo + " tem "
		        + livro1.quantidadeDePaginas + " paginas");

		livro1.adicionarPaginas(-20);

		System.out.println("Depois da tentativa inválida, o livro "
		        + livro1.titulo + " tem " + livro1.quantidadeDePaginas + " paginas");
		
		System.out.println("--- ADICIONAR ---");

		livro1.adicionarPaginas(50);

		System.out.println("Paginas atuais: " + livro1.quantidadeDePaginas);

		livro1.adicionarPaginas(-20);

		System.out.println("Paginas atuais: " + livro1.quantidadeDePaginas);

		System.out.println("--- REMOVER ---");

		livro1.removerPaginas(100);

		System.out.println("Paginas atuais: " + livro1.quantidadeDePaginas);

		livro1.removerPaginas(500);

		System.out.println("Paginas atuais: " + livro1.quantidadeDePaginas);
	}

}

