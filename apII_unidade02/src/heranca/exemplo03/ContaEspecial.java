package heranca.exemplo03;

public class ContaEspecial extends ContaBancaria {
	private float limite;
	
	public ContaEspecial(String cliente, int numeroConta, float saldo, float limite) {
		super(cliente, numeroConta, saldo);
		this.limite = limite;
	}
	public ContaEspecial() {
		super();
	}

}
