// marca, modelo e ano de fabricação
package lista5.exemplo03;
public class Carro {
	// declaração dos atributos
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	// métodos principais
	// métodos construtores
	public Carro(String marca, String modelo, int anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	public Carro() {}
	// métodos get e set
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public int getAnoFabricacao() {
		return this.anoFabricacao;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public void setAnoFabricacao(int anoFabricacao){
		this.anoFabricacao = anoFabricacao;
	}
}
