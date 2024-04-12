
public class Livro {
	
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	public void MostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro";
		System.out.println(mensagem);
		System.out.println("Nome: " + this.nome);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("ISBN: " + this.isbn);
		
		if(temAutor()) {
		autor.MostrarDetalesAutor();
		}
		
		System.out.println("--");
	}
	
	public double AplicarDesconto(double porcentagem) {
		
		valor = valor * porcentagem;
		
		return valor;
	}
	boolean temAutor() {
		return this.autor != null;
	}
}