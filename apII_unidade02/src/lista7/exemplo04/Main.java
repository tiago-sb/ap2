// Contagem de Ocorrências
// Desenvolva uma função que conte quantas vezes um número específico ocorre em um
// array de inteiros.

package lista7.exemplo04;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		NumeroEscolhido nesc = new NumeroEscolhido();
		
		int[] vetor = {12, 5, 6, 87, 2, 23, 56, 4, 1, 49, 1, 1, 49};
		int numeroEscolhido = entrada.nextInt();
		
		System.out.println(nesc.contagemDeVezes(vetor, numeroEscolhido));
		
		entrada.close();
	}
}
