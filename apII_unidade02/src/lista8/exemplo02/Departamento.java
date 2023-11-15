package lista8.exemplo02;

import java.util.ArrayList;
public class Departamento {
	ArrayList<Professor> professores = new ArrayList<>();
	private String nomeDepartamento;
	private String nomeUniversidade;
	private int numeroProfessores;
	
	public Departamento(String nomeDepartamento, String nomeUniversidade) {
		this.nomeDepartamento = nomeDepartamento;
		this.nomeUniversidade = nomeUniversidade;
	}
	public Departamento() {}
	
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public String getNomeUniversidade() {
		return nomeUniversidade;
	}
	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}
	public int getNumeroProfessores() {
		numeroProfessores = professores.size();
		return numeroProfessores;
	}
	public void setNumeroProfessores(int numeroProfessores) {
		this.numeroProfessores = numeroProfessores;
	}
	
	public void adicionarProfessor(Professor professor) {
		if(professor.getCpfProfessor() != null && professor.getNomeProfessor().length() > 0) {
			professores.add(professor);
		} else {
			System.out.println("invalido!");
		}
	}
	public void listarProfessores() {
		if(professores.size() > 0) {
			System.out.println(professores);
		} else {
			System.out.println("sem professores no departamento!");
		}
	}
	@Override
	public String toString() {
		numeroProfessores = professores.size();
		return "Departamento: " + nomeDepartamento + ", da universidade " + nomeUniversidade + ", numero de "
				+ "docentes " + numeroProfessores;
	}
}
