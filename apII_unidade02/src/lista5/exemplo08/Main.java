// Crie uma classe chamada Retângulo com os atributos comprimento e largura. Adicione
// um construtor e um método para calcular a área do retângulo. Crie 3 objetos e teste os
// métodos.

package lista5.exemplo08;
public class Main {
	public static void main(String[] args) {
		// instancias da classe retangulo
		Retangulo primeiroRetangulo = new Retangulo(100.0, 45.3);
		Retangulo segundoRetangulo = new Retangulo(70, 150.5);
		Retangulo terceiroRetangulo = new Retangulo(10.0, 50.0);
		// teste das funções
		System.out.println("comprimento: " + primeiroRetangulo.getComprimentoRetangulo() + "\nlargura: " + primeiroRetangulo.getLarguraRetangulo());
		System.out.println("area: " + primeiroRetangulo.calcularArea());
	}
}
