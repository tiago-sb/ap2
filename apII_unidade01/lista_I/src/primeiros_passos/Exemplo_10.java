// Velocidade Média
// Peça ao usuário para inserir a distância percorrida (em km) e o tempo gasto (em horas) em
// uma viagem. Calcule e exiba a velocidade média.

package primeiros_passos;
import java.util.Scanner;
public class Exemplo_10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float distancia = entrada.nextFloat();
		float tempo = entrada.nextFloat();
		float velocidade = distancia / tempo;
		System.out.println(velocidade);
		entrada.close();
	}
}
