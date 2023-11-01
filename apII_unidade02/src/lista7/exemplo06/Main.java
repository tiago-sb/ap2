// Multiplicação de Matrizes
// Crie uma função que realize a multiplicação de duas matrizes quadradas

package lista7.exemplo06;

public class Main {
	public static void main(String[] args) {
		Matriz matrizExemplo = new Matriz();
		
		int[][] primeiraMatriz = {
				{12, 5, 3},
				{45, 23, 1},
				{12, 2, 3}
		};
		int[][] segundaMatriz = {
				{10, 3, 3},
				{21, 20, 6},
				{17, 9, 5}
		};
		
		System.out.println("---");
		matrizExemplo.impressaoMatricial(primeiraMatriz);
		System.out.println("---");
		matrizExemplo.impressaoMatricial(segundaMatriz);
		System.out.println("---");
		
		int[][] resultado = matrizExemplo.multiplicacaoMatricial(primeiraMatriz, segundaMatriz);
		matrizExemplo.impressaoMatricial(resultado);
		
	}
}
