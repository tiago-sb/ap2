package heranca.exemplo02;

public class Funcionario extends Pessoa {
	private String codigo;
	private double salario;
	
	public Funcionario(String nome, String cpf, String endereco, String codigo, double salario) {
		super(nome, cpf, endereco);
		this.codigo = codigo;
		this.salario = salario;
	}
	public Funcionario() {
		super();
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
