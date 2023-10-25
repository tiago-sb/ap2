package lista6.exemplo04;
public class SomaAlgarismos {
	public int somaRecursiva(int primeiroValor, int segundoValor) {
		if(segundoValor <= 0) {
			return primeiroValor;
		}
		else {
			return somaRecursiva(primeiroValor + 1, segundoValor - 1);
		}
	}
}
// 2 + 3 = [3,2] [4,1] [5,0] 5
// 3 + 2 = [4,1] [5,0]
