// número da conta e saldo
// depositar, sacar e verificar o saldo
package lista5.exemplo07;

public class ContaBancaria {
	// atributos
	private int numeroConta;
	private double saldoConta;
	
	// métodos
	// construtores
	public ContaBancaria(int numeroConta, double saldoConta) {
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
	}
	public ContaBancaria() {}
	// metodos get e set
	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	// depositar da conta
	public void depositarNaConta(double valorDeposito) {
		if(valorDeposito >= 0) {
			saldoConta = saldoConta + valorDeposito;
		} else {
			saldoConta = saldoConta - valorDeposito;
		}
	}
	// sacar da conta
	public void sacarDaConta(double valorSaque) {
		if(valorSaque > saldoConta) {
			System.out.println("saque indisponivel");
		} else {
			if(valorSaque >= 0) {
				saldoConta = saldoConta - valorSaque;
			} else {
				saldoConta = saldoConta + valorSaque;
			}
		}
	}
	public void verificarSaldo() {
		System.out.println("saldo atual na conta: R$ " + saldoConta);
	}
}
