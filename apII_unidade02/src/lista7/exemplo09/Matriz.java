package lista7.exemplo09;

public class Matriz {

	public static void imprimeMatriz(int[][] matriz) {
		for (int[] linha : matriz) {
			for (int elemento : linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}

	public static int[] verificarMaioresMenores(int[][] matriz) {
		int maior = matriz[0][0];
		int menor = matriz[0][0];

		for (int[] linha : matriz){
			for (int elemento : linha){
				if (maior < elemento){
					maior = elemento;
				}
				if (menor > elemento){
					menor = elemento;
				}
			}
		}

		int[] resultado = {maior, menor};
		return resultado;
	}
}
