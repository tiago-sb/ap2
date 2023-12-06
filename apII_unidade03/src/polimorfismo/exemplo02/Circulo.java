package polimorfismo.exemplo02;

public class Circulo extends Forma {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	public Circulo() {}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	public double calcularperimetro() {
		return 2 * Math.PI * raio;
	}
	
	@Override
	public String toString() {
		return super.toString() + " circulo de area: " + 
				calcularArea() + " e perimetro: " + calcularperimetro();
	}
}
