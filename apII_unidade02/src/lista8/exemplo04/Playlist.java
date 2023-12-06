package lista8.exemplo04;

import java.util.ArrayList;
public class Playlist {
	private String nomePlaylist;
	private float tempoDurancao;
	ArrayList<Musica> musicas = new ArrayList<>();
	
	public Playlist(String nomePlaylist, float tempoDurancao) {
		super();
		this.nomePlaylist = nomePlaylist;
		this.tempoDurancao = tempoDurancao;
	}
	public Playlist() {}
	
	public String getNomePlaylist() {
		return nomePlaylist;
	}
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	public float getTempoDurancao() {
		return tempoDurancao;
	}
	public void setTempoDurancao(float tempoDurancao) {
		this.tempoDurancao = tempoDurancao;
	}
	
	@Override
	public String toString() {
		return "Playlist " + nomePlaylist + ", tempo de durancao = " + tempoDurancao + ", musicas = " + musicas;
	}
	
	
}
