package polimorfismo.exemplo01;

import java.util.ArrayList;
public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Livro("Java como Programar", 148f, "Deitel", 1000));
		produtos.add(new Caneta("Bic", 4.5f, "preta"));
		produtos.add(new Produto("Jarro", 36.99));
		
		for(Produto produto : produtos) {
			System.out.println(produto.toString());
		}
	}
}
