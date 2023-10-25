package lista6.exemplo05;
public class Palindromo {
	public boolean palindromo(String palavraDigitada) {
		palavraDigitada = palavraDigitada.replaceAll(" ", " ").toLowerCase();
		int tamanhoPalavra = palavraDigitada.length();
		if (tamanhoPalavra <= 1) {
			return true;
		} else {
			if (palavraDigitada.charAt(0) == palavraDigitada.charAt(tamanhoPalavra - 1)) {
				return palindromo(palavraDigitada.substring(1, tamanhoPalavra - 1));
			} else {
				return false;
			}
		}
	}
}
