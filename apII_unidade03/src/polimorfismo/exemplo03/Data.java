package polimorfismo.exemplo03;

public class Data {
	int data;
	int mes;
	int ano;
	
	
	public Data(int data, int mes, int ano) {
		this.data = data;
		this.mes = mes;
		this.ano= ano;
	}
	public Data() {}
	
	@Override
	public String toString() {
		return data + "/" + mes + "/" + ano;
	}
}
