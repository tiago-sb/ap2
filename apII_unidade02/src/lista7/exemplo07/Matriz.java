package lista7.exemplo07;

public class Matriz {
	public static void imprimeMatriz(int[][] matrizInteiros) {		
		for(int[] linhas : matrizInteiros) {
			for(int elementoLinha : linhas) {
				System.out.print(elementoLinha + " ");
			}
			System.out.println(" ");
		}
	}
	
	public static int[] calculoDiagonal(int[][] matrizInteiros) {
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		
		
		for(int i = 0; i < matrizInteiros.length; i++) {
			somaDiagonalPrincipal += matrizInteiros[i][i];
			somaDiagonalSecundaria += matrizInteiros[i][matrizInteiros.length - i - 1];
		}
		
		int[] resultado = {somaDiagonalPrincipal, somaDiagonalSecundaria}; 
		
		return resultado;
	}
}

// 0,0 0,1 0,2
// 1,0 1,1 1,2
// 2,0 2,1 2,2
