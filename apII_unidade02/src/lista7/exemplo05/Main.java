// Soma de Linhas
// Escreva um programa que calcule a soma dos elementos de cada linha de uma matriz de
// inteiros.

package lista7.exemplo05;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Matriz mt = new Matriz();
		
		int[][] matriz = {{5, 5, 6},{9, 8, 5},{8, 1, 3}};
		mt.imprimeMatriz(matriz);
		
		System.out.print("escolha a linha (comeca em 1): ");
		int linhaEscolhida = entrada.nextInt();
		
		System.out.println(mt.somaDeLinha(matriz, linhaEscolhida));
	}
}