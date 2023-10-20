// base e altura

package lista5.exemplo05;
public class Triangulo {
	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public Triangulo() { }
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularAreaTriangulo() {
		return ((base * altura) / 2);
	}
	
}
