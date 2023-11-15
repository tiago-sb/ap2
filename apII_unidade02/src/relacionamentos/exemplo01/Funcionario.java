package relacionamentos.exemplo01;
import java.util.Scanner;

public class Funcionario {
	Scanner entrada = new Scanner(System.in);
	// atributos para funcionario
	private int numeroMatricula;
	private String nomeFuncionario;
	private String cargoAtual;
	private float salarioAtual;
	// metodos
	// construtor
	public Funcionario(int numeroMatricula, String nomeFuncionario, String cargoAtual, float salarioAtual) {
		this.numeroMatricula = numeroMatricula;
		this.nomeFuncionario = nomeFuncionario;
		this.cargoAtual = cargoAtual;
		this.salarioAtual = salarioAtual;
	}
	public Funcionario() {}
	// get e set
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getCargoAtual() {
		return cargoAtual;
	}
	public void setCargoAtual(String cargoAtual) {
		this.cargoAtual = cargoAtual;
	}
	public float getSalarioAtual() {
		return salarioAtual;
	}
	public void setSalarioAtual(float salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	// método toString
	@Override
	public String toString() {
		return "Funcionario: numero de matricula = " + numeroMatricula + ", nome do funcionario = " + nomeFuncionario
				+ ", cargo atual = " + cargoAtual + ", salario atual = " + salarioAtual;
	}
	// métodos
	public float atualizarSalario(float novoSalario) {
		this.salarioAtual = novoSalario;
		return salarioAtual;
	}
}
