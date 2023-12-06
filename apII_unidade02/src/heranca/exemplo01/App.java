package heranca.exemplo01;

public class App {
	public static void main(String[] args) {
		Medico primeiroMedico = new Medico("Sao rafael");
		Cirurgiao primeiroCirurgiao = new Cirurgiao("Sao rafael");
		MedicoFamiliar primeiroMedicoFamiliar = new MedicoFamiliar("Sao rafael", true);
	
		primeiroMedico.tratarPaciente();
		
		primeiroCirurgiao.tratarPaciente();
		primeiroCirurgiao.fazerCirurgia();
		
		primeiroMedicoFamiliar.consultar();
	}
}
