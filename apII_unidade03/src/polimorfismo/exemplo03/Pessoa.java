package polimorfismo.exemplo03;

public class Pessoa {
	private String nome;
	private Data data;
	
	public Pessoa(String nome, Data data) {
		this.nome = nome;
		this.data = data;
	}
	public Pessoa() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "nome: " + nome + ", data " + data; 
	}
}
