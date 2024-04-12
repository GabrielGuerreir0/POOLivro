
public class Principal {
	public static void main(String args[]) {
		
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789.10";
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Pratica";
		livro.descricao = "Novo recursso de linguagem";
		livro.valor = 50.90;
		livro.isbn = "978-85-66250-46-5";
		
	//	livro.autor = autor;
		
		livro.valor = livro.AplicarDesconto(0.1);
		
		livro.MostrarDetalhes();
//		System.out.println(livro.nome);
//		System.out.println(livro.descricao);
//		System.out.println(livro.valor);
//		System.out.println(livro.isbn);
//		
		Autor autor2 = new Autor();
		autor2.nome = "Paulo Silveira";
		autor2.email = "aulo.silveira@caelum.com.br";
		autor2.cpf = "123.456.789.10";
		
		Livro outro_livro = new Livro();
		outro_livro.nome = "Lógica de programação";
		outro_livro.descricao = "Crie seus primeiro programas";
		outro_livro.valor = 59.90;
		outro_livro.isbn = "978-86-66250-22-0";
//		System.err.println(outro_livro.nome);
//		System.err.println(outro_livro.descricao);
//		System.err.println(outro_livro.valor);
//		System.err.println(outro_livro.isbn);
		
		outro_livro.autor = autor2;
		
		outro_livro.MostrarDetalhes();
	}
}
