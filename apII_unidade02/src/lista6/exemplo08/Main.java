// Inversão de String
// Desenvolva uma função recursiva que inverta uma string.

package lista6.exemplo08;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		InverteString invertida = new InverteString();
		
		String palavraEscolhida = entradaDeDados.nextLine();
		
		System.out.println(invertida.inverteString(palavraEscolhida));
		
		entradaDeDados.close();
	}
}
