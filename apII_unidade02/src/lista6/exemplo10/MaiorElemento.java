package lista6.exemplo10;

public class MaiorElemento {
	public int maiorElemento(int[] vetorInteiros, int posicao, int maior) {
		if(posicao <= 0) {
			return maior;
		} else {
			if(maior < vetorInteiros[posicao - 1]) {
				maior = vetorInteiros[posicao - 1];
			}
			
			return maiorElemento(vetorInteiros, posicao - 1, maior);
		}
	}
}	
