// Maior e Menor Elemento
// Desenvolva um programa que encontre o maior e o menor elemento em um array de
// inteiros.

package lista7.exemplo09;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = {
				{1, 2, 3},
				{8, 4, 6},
				{49, 5, -6}
		}; 
		
		Matriz.imprimeMatriz(matriz);
		int[] resultado = Matriz.verificarMaioresMenores(matriz);
		System.out.print("maior e menor respectivamente: ");
		for(int elemento : resultado) {
			System.out.print(elemento + " ");
		}
		
	}
}
