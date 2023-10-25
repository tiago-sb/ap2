// Fibonacci
// Implemente uma função recursiva para calcular o n-ésimo número da sequência de
// Fibonacci.

package lista6.exemplo02;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		Fibonacci fb = new Fibonacci();
		
		int numeroEscolhido = entradaDeDados.nextInt();
		
		System.out.println(fb.fibonacci(numeroEscolhido));
		
		entradaDeDados.close();
	}
}
