// Tempo de Viagem
// Peça ao usuário a distância a percorrer (em km) e a velocidade média (em km/h) e calcule o
// tempo estimado de viagem.

package primeiros_passos;

import java.util.Scanner;
public class Exemplo_7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float distancia = entrada.nextFloat();
		float velocidadeMedia = entrada.nextFloat();
		float tempo = distancia / velocidadeMedia;
		System.out.println(tempo);
		entrada.close();
	}
}
