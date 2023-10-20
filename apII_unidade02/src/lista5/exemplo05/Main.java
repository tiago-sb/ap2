// Crie uma classe chamada Triângulo com os atributos base e altura. Adicione um
// construtor e um método para calcular a área do triângulo. Crie 3 objetos e teste os métodos.

package lista5.exemplo05;
public class Main {
	public static void main(String[] args) {
		Triangulo triangulo01 = new Triangulo(5, 10);
		Triangulo triangulo02 = new Triangulo(45, 89.6F);
		Triangulo triangulo03 = new Triangulo(110, 34.7F);
		System.out.println("base: " + triangulo01.getBase() + ", altura: " + triangulo01.getAltura());
		System.out.println("area: " + triangulo01.calcularAreaTriangulo());
		
		System.out.println("base: " + triangulo02.getBase() + ", altura: " + triangulo02.getAltura());
		System.out.println("area: " + triangulo02.calcularAreaTriangulo());
		
		System.out.println("base: " + triangulo03.getBase() + ", altura: " + triangulo03.getAltura());
		System.out.println("area: " + triangulo03.calcularAreaTriangulo());
	}
}
