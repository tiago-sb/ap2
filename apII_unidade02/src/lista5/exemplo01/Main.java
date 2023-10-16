// Crie uma classe chamada Pessoa com os atributos nome e idade. Em seguida, crie um
// construtor para inicializar esses atributos e métodos getters e setters para acessá-los. Crie
// 5 objetos do tipo Pessoa e teste os métodos criados.

package lista5.exemplo01;
public class Main {

	public static void main(String[] args) {
		// instanciando os objetos
		Pessoa pessoa1 = new Pessoa(20,"ana");
		Pessoa pessoa2 = new Pessoa(27,"rita");
		Pessoa pessoa3 = new Pessoa(34,"tailon");
		Pessoa pessoa4 = new Pessoa(24,"fagner");
		Pessoa pessoa5 = new Pessoa(30,"natalia");
		// prints
		System.out.println(pessoa1.getIdade() + ", " + pessoa1.getNome());
		System.out.println(pessoa2.getIdade() + ", " + pessoa2.getNome());
		System.out.println(pessoa3.getIdade() + ", " + pessoa3.getNome());
		System.out.println(pessoa4.getIdade() + ", " + pessoa4.getNome());
		System.out.println(pessoa5.getIdade() + ", " + pessoa5.getNome());
	}
}
