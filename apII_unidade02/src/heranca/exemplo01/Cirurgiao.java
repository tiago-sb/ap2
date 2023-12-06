package heranca.exemplo01;

public class Cirurgiao extends Medico {
	
	public Cirurgiao(String nomeHospital) {
		super(nomeHospital);
	}
	public Cirurgiao() {
		super();
	}
	
	@Override
	public void tratarPaciente() {
		super.tratarPaciente();
	}
	public void fazerCirurgia() {
		System.out.println("fazendo cirurgia.");
	}
}
