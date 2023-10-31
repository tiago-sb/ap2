package lista7.exemplo04;

public class NumeroEscolhido {
	public int contagemDeVezes(int[] vetor, int chave) {
		int cont = 0; 
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == chave)
				cont++;
		}
		
		return cont;
	}
}
