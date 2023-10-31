// Soma de Elementos
// Crie um programa que calcule a soma dos elementos de um array de inteiros
package lista7.exemplo01;

public class Main {
	public static void main(String[] args) {	
		SomaInteiros sint = new SomaInteiros();
		
		int[] vetorInteiros = {12, 45, 7, 8, 98, 43, 21, 44, 1, 9}; 
		
		System.out.println(sint.somaInteiros(vetorInteiros, vetorInteiros.length));
	}
}
