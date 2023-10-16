// Conversão de Moeda
// Crie um programa que converta uma quantia em dólares para outra moeda (por exemplo,
// euros ou reais). Peça ao usuário para inserir a taxa de conversão e exiba o valor convertido.

package primeiros_passos;
import java.util.Scanner;
public class Exemplo_9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float quantiaOriginal = entrada.nextFloat();
		float taxaConversao = entrada.nextFloat();
		float quantiaConvertida = quantiaOriginal * taxaConversao;
		System.out.println(quantiaConvertida);
		entrada.close();
	}
}
