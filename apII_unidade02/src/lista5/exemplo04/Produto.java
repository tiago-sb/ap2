// nome, preço e quantidade em estoque

package lista5.exemplo04;
public class Produto {
	private String nomeProduto;
	private float precoProduto;
	private int quantidadeProduto;
	
	public Produto(String nomeProduto, float precoProduto, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeProduto = quantidadeProduto;
	}
	public Produto() { }
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public float getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	// métdos úteis
	// retorna o preco total a se pagar pelo produto, dado o valor e a quantidade
	public float calcularPrecoProduto() {
		return precoProduto * quantidadeProduto;
	}
	
	// adição e remoção da quantidade total do produto em questão
	public void adicionarUnidades(int quantidade) {
		if(quantidade >= 0)
			quantidadeProduto += quantidade;
		else
			quantidadeProduto -= quantidade; 
	}
	public void removerUnidades(int quantidade) {
		if(quantidade < 0)
			quantidadeProduto += quantidade;
		else
			quantidade -= quantidade; 
	}
}
