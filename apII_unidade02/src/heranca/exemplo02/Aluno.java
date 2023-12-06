package heranca.exemplo02;

public class Aluno extends Pessoa {
	private String matricula;
	
	public Aluno(String nome, String cpf, String endereco, String matricula) {
		super(nome, cpf, endereco);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
