package heranca.exemplo01;

public class Medico {
	private String nomeHospital;
	
	public Medico(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	public Medico() {}
	
	public String getNomeHospital() {
		return nomeHospital;
	}
	public void setNomeHospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	public void tratarPaciente() {
		System.out.println("tratando paciente no hospital " + nomeHospital + ". ");
	}	
}
