
package lista5.exemplo10;
import java.lang.Math;
public class SegundoGrau {
	private double constanteGrauDois;
	private double constanteGrauUm;
	private double constanteGrauZero;
	
	public SegundoGrau(double constanteGrauDois, double constanteGrauUm, double constanteGrauZero) {
		this.constanteGrauDois = constanteGrauDois;
		this.constanteGrauUm = constanteGrauUm;
		this.constanteGrauZero = constanteGrauZero;
	}
	public SegundoGrau() {}
	
	public double getConstanteGrauDois() {
		return constanteGrauDois;
	}
	public void setConstanteGrauDois(double constanteGrauDois) {
		this.constanteGrauDois = constanteGrauDois;
	}
	
	public double getConstanteGrauUm() {
		return constanteGrauUm;
	}
	public void setConstanteGrauUm(double constanteGrauUm) {
		this.constanteGrauUm = constanteGrauUm;
	}
	
	public double getConstanteGrauZero() {
		return constanteGrauZero;
	}
	public void setConstanteGrauZero(double constanteGrauZero) {
		this.constanteGrauZero = constanteGrauZero;
	}
	
	public void segundoGrau(){
		
		double delta = Math.pow(constanteGrauUm, 2) - (4 * constanteGrauDois * constanteGrauZero);
	
		double raiz1 = (-constanteGrauUm + Math.sqrt(delta)) / (2 * constanteGrauDois);
	    double raiz2 = (-constanteGrauUm - Math.sqrt(delta)) / (2 * constanteGrauDois);
	    
	    if (delta > 0) {    
	        System.out.println(raiz1 + ", " + raiz2);
	    } else if (delta == 0) {
	        System.out.println(raiz1); 
	    } else {
	        System.out.println("nao possui raiz nos reais");
	    }
	}
    
	
	@Override
	public String toString() {
		return constanteGrauDois + "x^2 + " + constanteGrauUm + "x + " + constanteGrauZero;
	}
}