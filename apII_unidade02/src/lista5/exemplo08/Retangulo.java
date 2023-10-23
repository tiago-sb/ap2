// comprimento e largura

package lista5.exemplo08;
public class Retangulo {
	// atributos
	private double comprimentoRetangulo;
	private double larguraRetangulo;
	// metodos
	// construtores
	public Retangulo(double comprimentoRetangulo, double larguraRetangulo) {
		this.comprimentoRetangulo = comprimentoRetangulo;
		this.larguraRetangulo = larguraRetangulo;
	}
	public Retangulo() {}
	// get e set
	public double getComprimentoRetangulo() {
		return comprimentoRetangulo;
	}
	public double getLarguraRetangulo() {
		return larguraRetangulo;
	}
	public void setComprimentoRetangulo(double comprimentoRetangulo) {
		this.comprimentoRetangulo = comprimentoRetangulo;
	}
	public void setLarguraRetangulo(double larguraRetangulo) {
		this.larguraRetangulo = larguraRetangulo;
	}
	// calcular area
	public double calcularArea() {
		return comprimentoRetangulo * larguraRetangulo;
	}
}
