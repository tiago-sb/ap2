// Média dos Elementos
// Escreva um programa que calcule a média dos elementos de um array de floats.

package lista7.exemplo03;

public class Main {
	public static void main(String[] args) {
		MediaDosTermos mdt = new MediaDosTermos();
		
		float[] vetor = {7f, 6.6f, 5.2f, 2.0f, 9.4f, 84.6f, 3.63f, 23.1f, 85.02f};
		
		System.out.println(mdt.mediaGeral(vetor));
	}
}
