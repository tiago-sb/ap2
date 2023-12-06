// Escreva uma função recursiva para calcular o fatorial de um número inteiro não negativo.

package lista8.exemplo04;

import java.util.Scanner;
public class Main {

	public static int fatorialRec(int numero) {
		if(numero <= 1) {
			return 1;
		} else {
			return numero * fatorialRec(numero - 1);
		}
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		System.out.println(fatorialRec(numero));
	}
}
