package lista6.exemplo01;
public class Fatorial {
	// atributo
	private int numeroEscolhido;
	// métodos
	public Fatorial(int numeroEscolhido) {
		this.numeroEscolhido = numeroEscolhido;
	}
	public Fatorial() {}
	// get e set
	public int getNumeroEscolhido() {
		return numeroEscolhido;
	}
	public void setNumeroEscolhido(int numeroEscolhido) {
		this.numeroEscolhido = numeroEscolhido;
	}
	// calculo do fatorial
	public int fatorial(int numeroEscolhido) {
		if(numeroEscolhido <= 1) {
			return 1;
		} else {
			return numeroEscolhido * fatorial(numeroEscolhido - 1);
		}
	}
}
