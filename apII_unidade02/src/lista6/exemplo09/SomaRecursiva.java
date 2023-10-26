package lista6.exemplo09;
public class SomaRecursiva {
	public int somaRecursiva(int[] vetorEscolhido, int posicao) {
		 if(posicao == vetorEscolhido.length) {
			 return 0;
		 }
		 else {
			 return vetorEscolhido[posicao] + somaRecursiva(vetorEscolhido, posicao + 1);
		 }
	}
}
