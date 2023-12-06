package polimorfismo.exemplo01;

public class Livro extends Produto {
	private String autor;
	private int numeroPaginas;
	
	public Livro(String nome, double preco, String autor, int numeroPaginas) {
		super(nome, preco);
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	public Livro() {
		super();
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", autor: " + autor + ", numero de paginas: " + numeroPaginas;
	}
}
