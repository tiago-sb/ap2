package lista8.exemplo02;

import java.util.Scanner;
public class Professor {
	Scanner entrada = new Scanner(System.in);
	private String nomeProfessor;
	private String cpfProfessor;
	private String tituloProfessor;
	private boolean aulaDada = false;
	
	public Professor(String nomeProfessor, String cpfProfessor, String tituloProfessor) {
		this.nomeProfessor = nomeProfessor;
		this.cpfProfessor = cpfProfessor;
		this.tituloProfessor = tituloProfessor;
	}
	public Professor() {}
	
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public String getCpfProfessor() {
		return cpfProfessor;
	}
	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}
	public String getTituloProfessor() {
		return tituloProfessor;
	}
	public void setTituloProfessor(String tituloProfessor) {
		this.tituloProfessor = tituloProfessor;
	}
	
	public boolean getAulaDada() {
		return aulaDada;
	}
	public void setAulaDada(boolean aulaDada) {
		this.aulaDada = aulaDada;
	}
	
	public void deuAula() {
		System.out.println("deu aula? (s/n)");
		char opcao = entrada.next().charAt(0);
		darAula(opcao);
	}
	private boolean darAula(char opcao) {
		if(opcao == 's') {
			return !aulaDada;
		} else {
			return aulaDada;
		}
	}
	
	@Override
	public String toString() {
		return "Professor: " + nomeProfessor + ", titulo Professor = " + tituloProfessor;
	}
}
