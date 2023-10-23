// nome, matrícula e 3 notas
package lista5.exemplo06;
public class Aluno {
	// atributos do aluno
	private String nomeAluno;
	private String codigoDeMatricula;
	private double[] notasAluno;
	//métodos construtores
	public Aluno (String nomeAluno, String codigoDeMatricula, double[] notasAluno) {
		this.nomeAluno = nomeAluno;
		this.codigoDeMatricula = codigoDeMatricula; 
		this.notasAluno = notasAluno;
	}
	public Aluno() {}
	// métodos
	// métodos get e set
	public String getNomeAluno() {
		return nomeAluno;
	}
	public String getCodigoDeMatricula() {
		return codigoDeMatricula;
	}
	public double[] getNotasAluno() {
		return notasAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public void setCodigoDeMatricula(String codigoDeMatricula) {
		this.codigoDeMatricula = codigoDeMatricula;
	}
	public void setNotasAluno(double[] notasAluno) {
		this.notasAluno = notasAluno;
	}
	// mostrar notas
	public void mostrarNotas() {
		for(double notaAtual: notasAluno)
			System.out.print(notaAtual + " ");
	}
	// calculo de media
	public double calcularMediaNotas() {
		double somaDeNotas = 0;
		for(double somador : notasAluno)
			somaDeNotas = somaDeNotas + somador;
			
		return somaDeNotas / notasAluno.length;
	}
}
