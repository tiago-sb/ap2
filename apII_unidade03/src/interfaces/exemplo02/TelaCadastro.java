package interfaces.exemplo02;

public class TelaCadastro {
	public static void main(String[] args) {
		// secao de cadastro de pessoas
		// cada objeto eh de uma subclasse de Pessoa 
		Pessoa primeiraPessoa = new Cliente("joao", new Data(11, 12, 2000), 1001);
		Pessoa segundaPessoa = new Funcionario("maria", new Data(21, 5, 1990), 1500.0f);
		Pessoa terceiraPessoa = new Gerente("claudio", new Data(25, 7, 1979), 5000.0f, "vendas");
		
		// instanciamento de objeto para poder adicionar as pessoas na lista de pessoas
		CadastroPessoas cadastro = new CadastroPessoas();
		cadastro.cadastrarPessoas(primeiraPessoa);
		cadastro.cadastrarPessoas(segundaPessoa);
		cadastro.cadastrarPessoas(terceiraPessoa);
		
		// imprime na tela as caracteristicas de todos os objetos presentes na lista de pessoas
		cadastro.imprimeCadastro();
	}
}
