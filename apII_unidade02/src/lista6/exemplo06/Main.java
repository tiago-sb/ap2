// Busca Binária
// Crie uma função recursiva para realizar uma busca binária em um array ordenado

package lista6.exemplo06;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		BuscaBinaria buscaBinaria = new BuscaBinaria();
		
		int[] vetorOrdenado = {10, 15, 20, 25, 26, 48, 69, 78, 79, 80, 86};	
		
		if(buscaBinaria.buscaBinaria(vetorOrdenado, 101)) {
			System.out.println("encontrado");
		}
		else {
			System.out.println("nao encontrado");
		}
		
		entradaDeDados.close();
	}
}
