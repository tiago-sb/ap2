package lista7.exemplo06;

public class Matriz {
	public int[][] multiplicacaoMatricial(int[][] primeiraMatriz, int[][] segundaMatriz) {
		int[][] resultado = new int[primeiraMatriz.length][primeiraMatriz.length];
		
		for(int i = 0; i < primeiraMatriz.length; i++) {
			for(int j = 0; j < primeiraMatriz.length; j++) {
				int soma = 0;
				for(int k = 0; k < primeiraMatriz.length; k++) {
					soma += primeiraMatriz[i][k] * segundaMatriz[k][j];
				}
				resultado[i][j] = soma;
			}
		}
		
		return resultado;
	}

	public void impressaoMatricial(int[][] resultado) {
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado.length; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}