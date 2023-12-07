package interfaces.exemplo02;

public class Data {
	int diaAtual;
	int mesAtual;
	int anoAtual;
	
	public Data(int diaAtual, int mesAtual, int anoAtual) {
		this.diaAtual = diaAtual;
		this.mesAtual = mesAtual;
		this.anoAtual = anoAtual;
	}
	public Data() {}
	
	@Override
	public String toString() {
		return diaAtual + "/" + mesAtual + "/" + anoAtual;
	}
}
