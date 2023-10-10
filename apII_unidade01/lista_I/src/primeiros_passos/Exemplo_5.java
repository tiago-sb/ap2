// Cálculo de IMC
// Peça ao usuário para inserir seu peso (em kg) e altura (em metros) e calcule o Índice de
// Massa Corporal (IMC).
package primeiros_passos;
import java.util.Scanner;
public class Exemplo_5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float pesoUsurario = entrada.nextFloat();
		float alturaUsuario = entrada.nextFloat();
		float imcUsuario = pesoUsurario / (alturaUsuario * alturaUsuario);
		System.out.println(imcUsuario);
		entrada.close();
	}
}
