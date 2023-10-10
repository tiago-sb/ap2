// Cálculo de Desconto
// Solicite ao usuário o preço de um produto e o percentual de desconto. Calcule e exiba o
// preço com desconto.

package primeiros_passos;
import java.util.Scanner;
public class Exemplo_4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float precoProduto = entrada.nextFloat();
		float percentualDesconto = entrada.nextFloat();
		precoProduto = ((100F - percentualDesconto) / 100F) * precoProduto;
		System.out.println("R$ " + precoProduto);
		// System.out.println(temp *);
		entrada.close();
	}
}