package polimorfismo.exemplo02;

public abstract class Forma {
	
	public abstract double calcularArea();
	public abstract double calcularperimetro();
	
	@Override
	public String toString() {
		return "forma: ";
	}
}
