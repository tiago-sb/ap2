
package heranca.exemplo03;

public class ContaBancaria {
	private String cliente;
	private int numeroConta;
	private float saldo;
	
	public ContaBancaria(String cliente, int numeroConta, float saldo) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	public ContaBancaria() {}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float sacarDaConta(float valor) {
		if(valor <= saldo) {
			saldo -= valor;
		} else {
			saldo += 0;
		}
		return saldo;
	}
	
	public float depositarDaConta(float valor) {
		saldo += valor;
		return saldo;
	}
}
