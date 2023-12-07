package polimorfismo.exemplo03;

import java.util.ArrayList;
public class CadastroPessoa {
	ArrayList <Pessoa> pessoas = new ArrayList<>();
	
	public void cadastrarPessoa(Pessoa pessoa) {
		if(pessoa != null && pessoa instanceof Pessoa) {
			pessoas.add(pessoa);
		}
	}
	
	public ArrayList<Pessoa> imprimePessoa() {
		return pessoas;
	}
}
