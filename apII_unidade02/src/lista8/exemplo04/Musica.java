package lista8.exemplo04;

public class Musica {
	private String nomeMusica;
	private float tempoDuracao;
	
	public Musica(String nomeMusica, float tempoDuracao) {
		this.nomeMusica = nomeMusica;
		this.tempoDuracao = tempoDuracao;
	}
	public Musica() {}
	
	public String getNomeMusica() {
		return nomeMusica;
	}
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public float getTempoDuracao() {
		return tempoDuracao;
	}
	public void setTempoDuracao(float tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	@Override
	public String toString() {
		return nomeMusica + ", tempo: " + tempoDuracao;
	}
	
}
