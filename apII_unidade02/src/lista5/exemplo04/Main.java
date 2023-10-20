// Crie uma classe chamada Produto com os atributos nome, preço e quantidade em
// estoque. Implemente métodos para calcular o valor total em estoque desse produto e para
// adicionar e remover unidades do estoque. Crie 5 objetos do tipo produto e teste os métodos
// criados.

package lista5.exemplo04;
public class Main {
	public static void main(String[] args) {
		// instancia dos objetos da classe produto
		// valores imaginarios*
		Produto milho = new Produto("milho", 3.75F, 5);
		Produto leite = new Produto("leite", 10.65F, 1);
		Produto canela = new Produto("Canela", 7.85F, 2);
		Produto cangica = new Produto("Cangica", 11.90F, 7);
		Produto miojo = new Produto("miojo", 1.45F, 3);
		// impressão
		System.out.print("nome do produto: " + milho.getNomeProduto() + ", valor: " + milho.getPrecoProduto());
		System.out.println(", quantidade: " + milho.getQuantidadeProduto());
		System.out.println("total a pagar: " + milho.calcularPrecoProduto());
		milho.adicionarUnidades(3);
		System.out.println("total a pagar: " + milho.calcularPrecoProduto());
		milho.removerUnidades(-5);
		System.out.println("total a pagar: " + milho.calcularPrecoProduto());
	}
}
