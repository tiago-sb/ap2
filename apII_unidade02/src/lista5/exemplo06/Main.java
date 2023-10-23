// Crie uma classe chamada Aluno com os atributos nome, matrícula e 3 notas. Implemente
// um construtor para inicializar esses atributos e um método para calcular a média das notas
// do aluno. Crie 3 objetos e teste os métodos.

package lista5.exemplo06;public class Main {
	public static void main(String[] args) {
		Aluno primeiroAluno = new Aluno("joao", "abc123", new double[] {7.5, 8.5, 9.3});
		Aluno segundoAluno = new Aluno("cleber", "def456", new double[] {7.8, 9.5, 4.3});
		Aluno terceiroAluno = new Aluno("joana", "ghi789", new double[] {5.6, 8.2, 5.3});
		System.out.println("nome: " + primeiroAluno.getNomeAluno() + "\nmatricula: " + primeiroAluno.getCodigoDeMatricula() + "\nnotas: ");
		primeiroAluno.mostrarNotas();
		System.out.println("\nmedia: " + primeiroAluno.calcularMediaNotas());
		
	}
}
