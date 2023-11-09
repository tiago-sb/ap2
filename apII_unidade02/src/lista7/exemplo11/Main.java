// Restaurantes
// Crie uma classe para descrever restaurantes. Os atributos devem ser: o nome, o endereço,
// o preço médio e o tipo de comida. a) Crie um construtor com argumentos e sem
// argumentos; b) Crie os métodos gets e sets; c) crie o método toString; d) Escreva um
// programa que crie um vetor de objetos restaurante e solicite a entrada dos dados pelo
// usuário. Em seguida, o programa pergunta o tipo de comida ao usuário e lista todos os
// restaurantes que o oferecem.

package lista7.exemplo11;

public class Main {
	public static void main(String[] args) {
		Catalogo cat = new Catalogo();
		
		Restaurante olviaFlores = new Restaurante("olivia flores", "Av. Olivia Flores", 65.5f, "massas");
		cat.adicionarRestaurante(olviaFlores);
		Restaurante fireBurger = new Restaurante("Fire Burger", "Av. Benjamin Flores", 85.5f, "hamburger");
		cat.adicionarRestaurante(fireBurger);
		Restaurante popBurger = new Restaurante("Pop Burger", "Av. Benjamin Olivia", 45.5f, "massas");
		cat.adicionarRestaurante(popBurger);
		cat.listarRestaurante();
		System.out.println("===============================");
		cat.listagemTipoAlimento("massas");
	}
}
