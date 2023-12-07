package interfaces.exemplo01;

import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		ArrayList<Forma> formas = new ArrayList<>();
		
		formas.add(new Quadrado(12.0));
		formas.add(new Circulo(12.0));
		
		for(Forma forma : formas) {
			System.out.println(forma.pegarNomeFigura());
			System.out.println(forma.pegarArea());
			System.out.println(forma.pegarPerimetro());
		}
	}
}
