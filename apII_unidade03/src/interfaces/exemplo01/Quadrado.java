package interfaces.exemplo01;

public class Quadrado implements Forma {
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
	
	@Override
	public String pegarNomeFigura() {
		return "Quadrado";
	}
	
	@Override
	public double pegarArea() {
		return Math.pow(lado, 2);
	}
	
	@Override
	public double pegarPerimetro() {
		return 4 * lado;
	}
}
