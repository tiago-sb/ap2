// Conversão de Temperatura
// Peça ao usuário para inserir uma temperatura em graus Celsius e converta-a para
// Fahrenheit. Exiba o resultado.

package primeiros_passos;
import java.util.Scanner;
public class Exemplo_3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float temperaturaCelsius = entrada.nextFloat();
		float temperaturaFahrenheit = (temperaturaCelsius * 1.8F) + 32;
		System.out.println(temperaturaFahrenheit);
		entrada.close();
	}
}
