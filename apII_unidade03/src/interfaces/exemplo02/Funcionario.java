package interfaces.exemplo02;

public class Funcionario extends Pessoa {
	private float salario; 
	
	public Funcionario(String nome, Data nascimento, float salario) {
		super(nome, nascimento);
		this.salario = salario;
	}
	public Funcionario() {
		super();
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// metodo que calcula o imposto do funcionario conforme o seu salario
	// imposto eh 3% do salario
	public float calculaImposto() { 
		return 0.03f * salario;
	}
	
	// implementacao de um metodo parecido ao toString, que possui a finalidade
	// de imprimir as caracteristicas principais do objeto funcionario
	@Override
	public String imprimeDados() {
		return "------------\nNome: " + nome + "\nData de nascimento: " + nascimento + 
				"\nSalario Bruto: " + salario + "\nSalario Liquido: " + (salario - calculaImposto());
	}
}
