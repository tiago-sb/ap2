package lista6.exemplo01;
public class Fatorial {
	public int fatorial(int numeroEscolhido) {
		if(numeroEscolhido <= 1) {
			return 1;
		} else {
			return numeroEscolhido * fatorial(numeroEscolhido - 1);
		}
	}
}
