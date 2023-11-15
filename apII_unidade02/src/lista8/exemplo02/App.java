package lista8.exemplo02;

public class App {
	public static void main(String[] args) {
		// criando professores
		Professor primeiroProfessor = new Professor("Carlos Colerico", "000.000.000-00", "mestre");
		Professor segundoProfessor = new Professor("maria sanguinia", "111.111.111-11", "doutor");
		Professor terceiroProfessor = new Professor("walter confusio", "122.222.222-22", "mestre");
		
		// criando departamentos
		Departamento primeiroDepartamento = new Departamento("DCET", "UESB");
		Departamento segundoDepartamento = new Departamento("DCB", "UESB");
		
		// criando a universidade
		Universidade universidadeGeral = new Universidade("UESB");
		
		// adicionando os professores aos departamentos
		primeiroDepartamento.adicionarProfessor(primeiroProfessor);
		primeiroDepartamento.adicionarProfessor(segundoProfessor);
		segundoDepartamento.adicionarProfessor(terceiroProfessor);
		
		//listar professores em seus respectivos departamentos
		primeiroDepartamento.listarProfessores();
		segundoDepartamento.listarProfessores();
		
		// adicionando os departamentos na universidade 
		universidadeGeral.adicionarDepartamento(primeiroDepartamento);
		universidadeGeral.adicionarDepartamento(segundoDepartamento);
		
		//listar departamentos pertencentes a universidade
		universidadeGeral.listarDepartamentos();
	}
}
