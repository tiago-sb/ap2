// Cálculo de Salário
// Solicite o valor da hora de trabalho e o número de horas trabalhadas no mês. Calcule e
// exiba o salário bruto.

package primeiros_passos;
import java.util.Scanner;
public class Exemplo_8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float horaDeTrabalho = entrada.nextFloat();
		float horasTrabalhadas = entrada.nextFloat(); 
		float salarioBruto = horaDeTrabalho * horasTrabalhadas;
		System.out.println(salarioBruto);
		entrada.close();
	}
}