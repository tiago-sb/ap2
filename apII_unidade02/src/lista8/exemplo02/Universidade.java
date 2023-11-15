package lista8.exemplo02;

import java.util.ArrayList;
public class Universidade {
	ArrayList<Departamento> departamentos = new ArrayList<>();
	private String nomeUniversidade;
	private int numeroDepartamentos;
	
	public Universidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade; 
	}
	public Universidade() {}
	public String getNomeUniversidade() {
		return nomeUniversidade;
	}
	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}
	public int getNumeroDepartamentos() {
		numeroDepartamentos = departamentos.size();
		return numeroDepartamentos;
	}
	public void setNumeroDepartamentos(int numeroDepartamentos) {
		this.numeroDepartamentos = numeroDepartamentos;
	}
	public void adicionarDepartamento(Departamento departamento) {
		if(departamento.getNomeDepartamento().length() > 0) {
			departamentos.add(departamento);
		} else {
			System.out.println("invalido!");
		}
	}
	public void listarDepartamentos() {
		if(departamentos.size() > 0) {
			System.out.println(departamentos);
		} else {
			System.out.println("sem departamentos na universidade!");
		}
	}
	@Override
	public String toString() {
		return "Universidade: " + nomeUniversidade + ", numero de departamentos " + numeroDepartamentos;
	}
	
}
