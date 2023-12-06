package lista8.exemplo03;

public class Jogador {
	private String nomeJogador;
	private int idadeJogador;
	private String nacionalidadeJogador;
	private Time timeJogador;
	
	public Jogador(String nomeJogador, int idadeJogador, String nacionalidadeJogador, Time timeJogador) {
		this.nomeJogador = nomeJogador;
		this.idadeJogador = idadeJogador;
		this.nacionalidadeJogador = nacionalidadeJogador;
		this.timeJogador = timeJogador;
	}
	public Jogador() {}
	
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public int getIdadeJogador() {
		return idadeJogador;
	}
	public void setIdadeJogador(int idadeJogador) {
		this.idadeJogador = idadeJogador;
	}
	public String getNacionalidadeJogador() {
		return nacionalidadeJogador;
	}
	public void setNacionalidadeJogador(String nacionalidadeJogador) {
		this.nacionalidadeJogador = nacionalidadeJogador;
	}
	public Time getTimeJogador() {
		return timeJogador;
	}
	public void setTimeJogador(Time timeJogador) {
		this.timeJogador = timeJogador;
	}
	@Override
	public String toString() {
		return "nomeJogador: " + nomeJogador + ", idade: " + idadeJogador + ", nacionalidade: "
				+ nacionalidadeJogador + ", time: " + timeJogador;
	}
}	
