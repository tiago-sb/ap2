package interfaces.exemplo02;

public abstract class Pessoa {
	protected String nome;
	protected Data nascimento;
	
	public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public Pessoa() {}
	
	// classe abstrata que infere um contrato no qual todas as suas classes filhas 
	// devem implementa-lo
	public abstract String imprimeDados();
}
