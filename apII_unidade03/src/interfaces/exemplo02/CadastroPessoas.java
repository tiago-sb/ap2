package interfaces.exemplo02;

import java.util.ArrayList;
public class CadastroPessoas {
	ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	// metodo utilizado para adicionar objetos no ArrayList de objetos da classe pessoa
	public void cadastrarPessoas(Pessoa pessoa){
		if(pessoa != null && pessoa instanceof Pessoa) {
			pessoas.add(pessoa);
		}
	}
	
	// metodo polimorfico para imprimir na tela objetos conforme a sua caracteristica 
	// caso seja funcionario sera de uma forma, caso for cliente de outra e gerente tambem
	public void imprimeCadastro() {
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa.imprimeDados());
		}
	}
}
