package lista6.exemplo08;
public class InverteString {
	public String inverteString(String palavraEscolhida) {
		if (palavraEscolhida.length() <= 1 || palavraEscolhida == null) {
            return palavraEscolhida;
        } else {
            return inverteString(palavraEscolhida.substring(1)) + palavraEscolhida.charAt(0);
        }
	 }
}
