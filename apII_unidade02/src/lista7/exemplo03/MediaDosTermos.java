package lista7.exemplo03;

public class MediaDosTermos {
	public float mediaGeral(float[] vetor) {
		float soma = 0;
		
		for(int i = 0; i < vetor.length; i++)
			soma += vetor[i];
		
		return soma / vetor.length;
	}
}
