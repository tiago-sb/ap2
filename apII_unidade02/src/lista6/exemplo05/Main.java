// Palíndromo
// Desenvolva uma função recursiva para verificar se uma string é um palíndromo (lê-se igual
// de trás para frente).

package lista6.exemplo05;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// instancias de classes que serão úteis
		Scanner entradaDeDados = new Scanner(System.in);
		Palindromo pl = new Palindromo();

		String palavraEscolhida = entradaDeDados.nextLine();
		
		// caso a palavra escolhida for um palíndromo: true
		System.out.println(pl.palindromo(palavraEscolhida));
		
		entradaDeDados.close();
	}
}