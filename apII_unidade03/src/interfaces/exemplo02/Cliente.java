package interfaces.exemplo02;

public class Cliente extends Pessoa {
	private int codigo;
	
	public Cliente(String nome, Data nascimento, int codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}
	public Cliente() {
		super();
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	// implementacao de um metodo parecido ao toString, que possui a finalidade
	// de imprimir as caracteristicas principais do objeto cliente
	@Override
	public String imprimeDados() {
		return "------------\nNome: " + nome + "\nCodigo cliente: " + codigo;
	}

}
