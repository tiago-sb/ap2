// Soma de Diagonais
// Escreva um programa que calcule a soma dos elementos das diagonais principal e
// secundária de uma matriz quadrada de inteiros.

package lista7.exemplo07;

public class Main {

	public static void main(String[] args) {
		int[][] matrizInteiros = {
				{2, 5, 6},
				{7, 8, 1},
				{5, 4, 1}
		};
		
		Matriz.imprimeMatriz(matrizInteiros);
		
		int[] resultado = Matriz.calculoDiagonal(matrizInteiros);
		System.out.println("soma princial e secundaria respectivamente:");
		for(int somaDiagonal : resultado) {
			System.out.print(somaDiagonal + " ");
		}
	}

}

// 0,0 0,1 0,2
// 1,0 1,1 1,2
// 2,0 2,1 2,2