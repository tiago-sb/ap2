// Maior de Elementos em um Array
// Implemente uma função recursiva que calcule o maior elemento em um array de inteiros.

package lista6.exemplo10;

public class Main {
	public static void main(String[] args) {
		// instancia do objeto
		MaiorElemento array = new MaiorElemento();

		// declaração das variáveis multiplas
		int[] vetorInteiros = {2, 8, 98, 75, 42, 4, 21, 8, 3, 15};
		int maior = vetorInteiros[0];

		// impressão
		System.out.println(array.maiorElemento(vetorInteiros, vetorInteiros.length, maior));
	}
}
