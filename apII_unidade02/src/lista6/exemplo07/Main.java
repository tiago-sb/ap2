// Contagem de Dígitos
// Escreva uma função recursiva que conte quantos dígitos um número inteiro positivo possui.

package lista6.exemplo07;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		ContagemDeDigitos contagem = new ContagemDeDigitos();
		
		int numeroEscolhido = entradaDeDados.nextInt();
		
		System.out.println(contagem.contarDigitos(numeroEscolhido));
		
		entradaDeDados.close();
	}
}
