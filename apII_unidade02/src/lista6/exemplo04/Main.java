// Soma de Dígitos
// Escreva uma função recursiva que calcule a soma dos dígitos de um número inteiro
// positivo.

package lista6.exemplo04;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		SomaAlgarismos somalg = new SomaAlgarismos(); 
		
		int primeiroValor = entradaDeDados.nextInt();
		int segundoValor = entradaDeDados.nextInt();
	
		System.out.println(somalg.somaRecursiva(primeiroValor, segundoValor));
	
		entradaDeDados.close();
	}
}
