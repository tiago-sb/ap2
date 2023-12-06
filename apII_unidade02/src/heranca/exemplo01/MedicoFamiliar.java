package heranca.exemplo01;

public class MedicoFamiliar extends Medico {
	private boolean atendimentoDomiciliar;
	
	public MedicoFamiliar(String nomeHospital, boolean atendimentoDomiciliar) {
		super(nomeHospital);
		this.atendimentoDomiciliar = atendimentoDomiciliar;
	}
	public MedicoFamiliar() {
		super();
	}
	
	public boolean getAtendimentoDomiciliar() {
		return atendimentoDomiciliar;
	}
	public void setAtendimentoDomiciliar(boolean atendimentoDomiciliar) {
		this.atendimentoDomiciliar = atendimentoDomiciliar;
	}
	
	public void consultar() {
		System.out.println("situacao da cirurgia " + atendimentoDomiciliar);
	}
}
