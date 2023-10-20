// Crie uma classe chamada Carro com os atributos marca, modelo e ano de fabricação.
// Implemente construtores para inicializar esses atributos e métodos para exibir as
// informações do carro. Crie 5 objetos do tipo Carro e teste os métodos.

package lista5.exemplo03;
public class Main {
	public static void main(String[] args) {
		// instâncias da classe Carro
		Carro primeiroCarro = new Carro("Richards Cars", "Sedan", 1998);
		Carro segundoCarro = new Carro("Fiat", "Uno", 2001);
		Carro terceiroCarro = new Carro("Jeep", "Jeep", 2005);
		Carro quartoCarro = new Carro("Montserat", "Audi -05", 2013);
		Carro quintoCarro = new Carro("Richards Cars", "Rotan", 1997);
		// impressões dos valores dos atributos
		System.out.print("marca: " + primeiroCarro.getMarca() + ", modelo: " + primeiroCarro.getModelo());
		System.out.println(", ano de fabricacao: " + primeiroCarro.getAnoFabricacao());
		
		System.out.print("marca: " + segundoCarro.getMarca() + ", modelo: " + segundoCarro.getModelo());
		System.out.println(", ano de fabricacao: " + segundoCarro.getAnoFabricacao());
		
		System.out.print("marca: " + terceiroCarro.getMarca() + ", modelo: " + terceiroCarro.getModelo());
		System.out.println(", ano de fabricacao: " + terceiroCarro.getAnoFabricacao());
		
		System.out.print("marca: " + quartoCarro.getMarca() + ", modelo: " + quartoCarro.getModelo());
		System.out.println(", ano de fabricacao: " + quartoCarro.getAnoFabricacao());
		
		System.out.print("marca: " + quintoCarro.getMarca() + ", modelo: " + quintoCarro.getModelo());
		System.out.println(", ano de fabricacao: " + quintoCarro.getAnoFabricacao());
	}
}
