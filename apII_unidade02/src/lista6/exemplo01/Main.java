// Fatorial
// Escreva uma função recursiva para calcular o fatorial de um número inteiro não negativo

package lista6.exemplo01;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		int numeroEscolhido = entradaDeDados.nextInt();
		Fatorial fat = new Fatorial(); 
		System.out.println(fat.fatorial(numeroEscolhido));
		entradaDeDados.close();
	}
}
// fatorial(numeroEscolhido)
