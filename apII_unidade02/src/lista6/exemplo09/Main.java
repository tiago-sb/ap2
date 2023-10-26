// Soma de Elementos em um Array
// Implemente uma função recursiva que calcule a soma de todos os elementos em um array
// de inteiros

package lista6.exemplo09;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		SomaRecursiva somaRec = new SomaRecursiva(); 
		
		int[] vetorDeInteiros = {45, 69, 53, 78, 12, 16, 8, 45, 9, 5, 14}; 
		
		for(int auxiliar: vetorDeInteiros) {
			System.out.print(auxiliar + " ");
		}
		
		// função que recebe como parametros o vetor e a posição inicial
		// que iniciará a contagem no array, neste caso a contagem começará 
		// na posição 0 do array
		System.out.println("\n" + somaRec.somaRecursiva(vetorDeInteiros,0));
		
		entradaDeDados.close();
	}
}
