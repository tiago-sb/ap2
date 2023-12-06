package polimorfismo.exemplo01;

public class Caneta extends Produto {
	private String cor;
	
	public Caneta(String nome, double preco, String cor) {
		super(nome, preco);
		this.cor = cor;
	}
	public Caneta() {
		super();
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", cor da caneta: " + cor;
	}
}
