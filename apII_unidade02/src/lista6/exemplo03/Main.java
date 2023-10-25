// Potência
// Crie uma função recursiva para calcular a potência de um número base elevado a um
// expoente inteiro não negativo.

package lista6.exemplo03;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		Potencia pot = new Potencia();
		
		int base = entradaDeDados.nextInt();
		int expoente;
		do {
			expoente = entradaDeDados.nextInt();
		} while(expoente < 0);
		
		System.out.println(pot.potencia(base, expoente));
		entradaDeDados.close();
	}
}
