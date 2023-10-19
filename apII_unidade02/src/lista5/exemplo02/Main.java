// Crie uma classe chamada Livro com os atributos título, autor e número de páginas.
// Adicione um construtor e métodos getters e setters para todos os atributos. Crie 5 objetos
// do tipo Livro e teste os métodos criados.

package lista5.exemplo02;

public class Main {
	public static void main(String[] args) {
		// instanciando os objetos da classe Livro
		Livro primeiroLivro = new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", 263);
		Livro segundoLivro = new Livro("A rainha vermelha", "Victoria Aveyard", 424);
		Livro terceiroLivro = new Livro("A prisao do rei", "Victoria Aveyard", 544);
		Livro quartoLivro = new Livro("terapia financeira", "Reinaldo Domingos", 135);
		Livro quintoLivro = new Livro("O poder da acao", "Paulo Vieira", 192);
		// printando o valor dos atributos
		System.out.println(primeiroLivro.getTitulo() + ", " + primeiroLivro.getAutor() + ", " + primeiroLivro.getNumeroPaginas());
		System.out.println(segundoLivro.getTitulo() + ", " + segundoLivro.getAutor() + ", " + segundoLivro.getNumeroPaginas());
		System.out.println(terceiroLivro.getTitulo() + ", " + terceiroLivro.getAutor() + ", " + terceiroLivro.getNumeroPaginas());
		System.out.println(quartoLivro.getTitulo() + ", " + quartoLivro.getAutor() + ", " + quartoLivro.getNumeroPaginas());
		System.out.println(quintoLivro.getTitulo() + ", " + quintoLivro.getAutor() + ", " + quintoLivro.getNumeroPaginas());
	}
}
