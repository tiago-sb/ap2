package lista8.exemplo03;

public class App {
	public static void main(String[] args) {
		Time vitoria = new Time("vitoria", 1899);
		Jogador cristianoRonaldo = new Jogador("cristiano ronaldo", 38, "portugal", vitoria);
		Jogador messi = new Jogador("lionel messi", 36, "argentina", vitoria);
		vitoria.adicionarJogador(cristianoRonaldo);
		vitoria.adicionarJogador(messi);
		
		vitoria.listarJogadores();
	}
}
