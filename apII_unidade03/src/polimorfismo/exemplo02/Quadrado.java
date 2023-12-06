package polimorfismo.exemplo02;

public class Quadrado extends Forma {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	public Quadrado() {}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return Math.pow(lado, 2);
	}
	public double calcularperimetro() {
		return 4 * lado;
	}
	
	@Override
	public String toString() {
		return super.toString() + " quadrado de area: " + 
				calcularArea() + " e perimetro: " + calcularperimetro();
	}
}
