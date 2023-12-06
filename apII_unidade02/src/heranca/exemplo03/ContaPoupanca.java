package heranca.exemplo03;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;
	
	public ContaPoupanca(String cliente, int numeroConta, float saldo, int diaRendimento) {
		super(cliente, numeroConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	public ContaPoupanca() {
		super();
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(float taxa) {
		super.depositarDaConta(taxa);
	}
	
}
