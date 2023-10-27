// Crie uma classe chamada Equação do segundo grau, métodos construtores, getters,
// setters e um método para resolver a equação do segundo grau. Crie 3 objetos e teste os
// métodos.

package lista5.exemplo10;
public class Main {
	public static void main(String[] args) {
		SegundoGrau primeiraEquacao = new SegundoGrau(1, 2, 1);
		SegundoGrau segundaEquacao = new SegundoGrau(1, 8, 1);
		SegundoGrau terceiraEquacao = new SegundoGrau(1, 2, 3);
		
		System.out.println(primeiraEquacao.toString());
		primeiraEquacao.segundoGrau();
		
		System.out.println("\n" + segundaEquacao.toString());
		segundaEquacao.segundoGrau();
		
		System.out.println("\n" + terceiraEquacao.toString());
		terceiraEquacao.segundoGrau();
	}
}
