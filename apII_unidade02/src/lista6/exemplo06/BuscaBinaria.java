package lista6.exemplo06;

public class BuscaBinaria {
	public boolean buscaBinaria(int[] vetorDeBusca, int chave) {
		return buscaBinariaRecursiva(vetorDeBusca, chave, 0, vetorDeBusca.length - 1);
	}

	public boolean buscaBinariaRecursiva(int[] vetorDeBusca, int chave, int inicio, int fim) {
		if (inicio <= fim) {
			int meio = (inicio + fim) / 2;

			if (vetorDeBusca[meio] == chave) {
				return true;
			} else {
				if (vetorDeBusca[meio] < chave) {
					return buscaBinariaRecursiva(vetorDeBusca, chave, meio + 1, fim);
				} else {
					return buscaBinariaRecursiva(vetorDeBusca, chave, inicio, meio - 1);
				}
			}
		}
		return false;
	}
}