// Exercício 1: Soma de Dois Números
// Solicite ao usuário dois números e exiba a soma deles.
 
package primeiros_passos;
import java.util.Scanner;
public class Exemplo_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int primeiroValor = entrada.nextInt();
		int segundoValor = entrada.nextInt();
		int resultado = primeiroValor + segundoValor;
		System.out.print(resultado);
		entrada.close();
	}
}
