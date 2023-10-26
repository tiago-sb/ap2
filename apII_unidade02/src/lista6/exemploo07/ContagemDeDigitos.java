package lista6.exemploo07;
public class ContagemDeDigitos {
	public int contarDigitos(int numeroEscolhido) {
		if(numeroEscolhido <= 0) {
			return 0;
		}
		else {
			return 1 + contarDigitos(numeroEscolhido / 10);
		}
	}
} 
// 100 = 1 + (10) + 1 + (1) + 1 + (0)
// 12 = 1 + (1) + 1 + (0)