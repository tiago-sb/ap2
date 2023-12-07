package interfaces.exemplo01;

public class Circulo implements Forma {
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
	
	@Override
	public String pegarNomeFigura() {
		return "Circulo";
	}
	
	@Override
	public double pegarArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	@Override
	public double pegarPerimetro() {
		return 2 * Math.PI * raio;
	}
}
