// Cálculo de Média
// Peça ao usuário para inserir três notas e calcule a média delas. Em seguida, exiba o resultado.

package primeiros_passos;
import java.util.Scanner;
public class Exemplo_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota, notas = 0, media;
		for(int i = 1; i <= 3; i++) {
			do {
				nota = entrada.nextFloat();
			} while(nota < 0);
			notas += nota;
		}
		media = notas / 3;
		System.out.println(media);
		entrada.close();
	}
}
