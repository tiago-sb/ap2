// Conversão de Unidades
// Solicite uma medida em metros e converta-a para centímetros e milímetros. Exiba os
// resultados.

package primeiros_passos;
import java.util.Scanner;
public class Exemplo_6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float valorEmMetros = entrada.nextFloat(); // 100m 
		float valorEmCentimetros = valorEmMetros * 100;
		float valorEmMilimetros = valorEmMetros * 1000;
		System.out.println(valorEmCentimetros);
		System.out.println(valorEmMilimetros);
		entrada.close();
	}
}

