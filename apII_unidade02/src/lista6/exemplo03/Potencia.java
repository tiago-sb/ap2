package lista6.exemplo03;

public class Potencia {
	public int potencia(int base, int expoente) {
		if(expoente == 0) {
			return 1;
		}
		else {
			return base * potencia(base, expoente - 1);
		}
	}
}
// 2 ^ 3 = 2 * 2 * 2
