package interfaces.exemplo02;

public class Gerente extends Funcionario {
	private String area;
	
	public Gerente(String nome, Data nascimento, float salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}
	public Gerente() {
		super();
	}
	
	public String getArea(){
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	// metodo que calcula o imposto do funcionario conforme o seu salario
	// imposto eh 3% do salario
	@Override
	public float calculaImposto() {
		return super.calculaImposto(); 
	}
	
	// implementacao de um metodo parecido ao toString, que possui a finalidade
	// de imprimir as caracteristicas principais do objeto gerente
	@Override
	public String imprimeDados() {
		return super.imprimeDados() + "\nArea: " + area + "\n------------";
	}
}
