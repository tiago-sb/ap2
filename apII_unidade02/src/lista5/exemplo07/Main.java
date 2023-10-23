// Crie uma classe chamada ContaBancaria com os atributos número da conta e saldo.
// Implemente construtores para inicializar esses atributos e métodos para depositar, sacar e
// verificar o saldo. Crie 5 objetos e teste os métodos.

package lista5.exemplo07;
public class Main {
	public static void main(String[] args) {
		// instanciamento da classe ContaBancaria
		ContaBancaria primeiraConta = new ContaBancaria(1001, 1000.0);
		ContaBancaria segundaConta = new ContaBancaria(1002, 1100.0);
		ContaBancaria terceiraConta = new ContaBancaria(1003, 115.9);
		ContaBancaria quartaConta = new ContaBancaria(1004, 89.87);
		ContaBancaria quintaConta = new ContaBancaria(1005, 626.2);
		// teste dos métodos
		System.out.println("numero da conta: " + primeiraConta.getNumeroConta() + "\nsaldo atual: " + primeiraConta.getSaldoConta());
		primeiraConta.depositarNaConta(1000.0);
		System.out.println("saldo atual: " + primeiraConta.getSaldoConta());
		primeiraConta.sacarDaConta(500);
		System.out.println("saldo atual: " + primeiraConta.getSaldoConta());
	}
}
