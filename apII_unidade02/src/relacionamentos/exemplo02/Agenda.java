package relacionamentos.exemplo02;
import java.util.ArrayList;
public class Agenda {
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	public void inserirContato(Contato contado) {
		contatos.add(contado);
	}
	public String buscarContato(String nome) {
		if(contatos.contains(nome)) {
			return "nao encontrado";
		}
		else {
			return "contato encontrado na posicao"
					+ contatos.indexOf(nome) + " da sua lista de contatos";
		}
	}
	public void removerContato(String nome) {
		int aux = contatos.indexOf(nome);
		contatos.remove(aux);
	}
	public int verificarQuantidade() {
		return contatos.size();
	}
	public ArrayList<Contato> listarContatos() {
		return contatos;
	}
}