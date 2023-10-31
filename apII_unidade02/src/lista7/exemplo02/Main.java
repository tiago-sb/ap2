// Maior Elemento
// Desenvolva uma função que encontre o maior elemento em um array de doubles.

package lista7.exemplo02;

public class Main {
	public static void main(String[] args) {
		ArrayDeDoubles add = new ArrayDeDoubles();
		
		double[] vetorDouble = {8.6, 2.3, 8, 96.1, 75.3, 58.4, 100.5};
		
		System.out.println(add.maiorElemento(vetorDouble, 0));
	}
}
