package polimorfismo.exemplo03;

public class TelaCadastro {

	public static void main(String[] args) {
		Pessoa primeiraPessoa = new Pessoa("joao", new Data(12, 11, 2000));
		
		System.out.println(primeiraPessoa);
	}
}
