package lista8.exemplo03;

import java.util.ArrayList;
public class Time {
	private String nomeTime;
	private int anoFundacao;
	ArrayList<Jogador> jogadores = new ArrayList<>();
	
	public Time(String nomeTime, int anoFundacao) {
		this.nomeTime = nomeTime;
		this.anoFundacao = anoFundacao;
	}
	public Time() {}
	
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	
	public void listarJogadores() {
		if(jogadores.size() > 0) {
			System.out.println(jogadores);
		} else {
			System.out.println("nao ha jogadores no time");
		}
	}
	
	public void adicionarJogador(Jogador jogador) {
		if(jogador.getNomeJogador().length() > 0) {
			jogadores.add(jogador);
		} else {
			System.out.println("operacao invalida");
		}
	}
	@Override
	public String toString() {
		return nomeTime + ", ano de fundacao " + anoFundacao + ".\n";
	}
}
