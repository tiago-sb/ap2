package polimorfismo.exemplo02;

public class App {

	public static void main(String[] args) {
		Forma[] formas = new Forma[3];
		
		formas[0] = new Quadrado(10);
		formas[1] = new Circulo(5);
		formas[2] = new Quadrado(20);
		
		for(Forma forma : formas) {
			System.out.println(forma.toString());
		}
	}

}
