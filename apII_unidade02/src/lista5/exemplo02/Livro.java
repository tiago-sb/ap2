package lista5.exemplo02;

public class Livro {
	// atributos
	private String titulo;
	private String autor;
	private int numeroPaginas;
	// metodos construtores
	public Livro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	public Livro() {}
	// metodos get e set
	// gets
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	// sets
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
}
