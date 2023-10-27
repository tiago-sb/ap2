package lista5.exemplo09;
public class Complexo {
	// atributos
	private double real;
	private double imaginaria;
	// metodos
	//construtores
	public Complexo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}
	public Complexo() {}
	// get e set
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginaria() {
		return imaginaria;
	}
	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	
	// soma
	// soma e retorna um objeto da classe Complexo com os parametros atualizados
	public Complexo somarComplexo(Complexo comp) {
		double parteReal = real + comp.real;
		double parteImaginaria = imaginaria + comp.imaginaria;
		return new Complexo(parteReal, parteImaginaria);
	}
	
	// uma nova cara para a função equals do java
	@Override
	public boolean equals(Object comp1) {
		if((comp1 != null) && (comp1 instanceof Complexo)) {
			Complexo comp2 = (Complexo) comp1;
			return (comp2.real == real && comp2.imaginaria == imaginaria);
		}
		
		return false;
	}
	// imprimir o número real na tela
	@Override
	public String toString() {
		return real + " + " + imaginaria + "i"; 
	}
}
