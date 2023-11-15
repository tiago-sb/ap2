package relacionamentos.exemplo01;

public class Dependente {
	private String nomeDependente;
	private String parentesco;
	
	public Dependente(String nomeDependente, String parentesco) {
		this.nomeDependente = nomeDependente;
		this.parentesco = parentesco;
	}
	public Dependente() {}
	

	public String getNomeDependente() {
		return nomeDependente;
	}
	public void setNomeDependente(String nomeDependente) {
		this.nomeDependente = nomeDependente;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	@Override
	public String toString() {
		return "Dependente: nomedo dependente = " + nomeDependente + ", parentesco = " + parentesco;
	}
}
