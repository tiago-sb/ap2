package lista7.exemplo01;

public class SomaInteiros {
	public int somaInteiros(int[] vetorInteiros, int tamanho) {
		if(tamanho <= 0) {
			return 0;
		} else {
			return vetorInteiros[tamanho - 1] + somaInteiros(vetorInteiros, tamanho - 1);
		} 
	}
}
