package lista7.exemplo05;

public class Matriz {
	public int somaDeLinha(int[][] vetor, int linhaEscolhida) {
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length; j++) {
				if(i == linhaEscolhida) {
					soma += vetor[i][j];
				}
			}
		}
		
		return soma;
	}
	
	public void imprimeMatriz(int[][] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length; j++) {
				System.out.print(vetor[i][j] + " ");
			}
			
			System.out.println(" ");
		}
	}
}
