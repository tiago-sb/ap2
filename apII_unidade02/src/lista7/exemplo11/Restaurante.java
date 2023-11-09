// Crie uma classe para descrever restaurantes. Os atributos devem ser: o nome, o endereço,
// o preço médio e o tipo de comida. a) Crie um construtor com argumentos e sem
// argumentos; b) Crie os métodos gets e sets; c) crie o método toString

package lista7.exemplo11;
public class Restaurante {
	private String nomeRestaurante;
	private String enderecoRestaurante;
	private float precoMedio;
	private String tipoComida;
	
	public Restaurante(String nomeRestaurante, String enderecoRestaurante, float precoMedio, String tipoComida) {
		this.nomeRestaurante = nomeRestaurante;
		this.enderecoRestaurante = enderecoRestaurante;
		this.precoMedio = precoMedio;
		this.tipoComida = tipoComida;
	}
	public Restaurante() {}
	
	public String getNomeRestaurante() {
		return nomeRestaurante;
	}
	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}
	public String getEnderecoRestaurante() {
		return enderecoRestaurante;
	}
	public void setEnderecoRestaurante(String enderecoRestaurante) {
		this.enderecoRestaurante = enderecoRestaurante;
	}
	public float getPrecoMedio() {
		return precoMedio;
	}
	public void setPrecoMedio(float precoMedio) {
		this.precoMedio = precoMedio;
	}
	public String getTipoComida() {
		return tipoComida;
	}
	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
	
	@Override
	public String toString() {
		return "Restaurante: nome do restaurante = " + nomeRestaurante + ", endereco do restaurante = " + enderecoRestaurante
				+ ", preco medio = " + precoMedio + ", tipo de comida servida = " + tipoComida;
	}
}
