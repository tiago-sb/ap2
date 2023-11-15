package relacionamentos.exemplo02;

import java.util.Scanner;

public class Main {
	public static void adicionarContato() {
		Scanner entradaDados = new Scanner(System.in);
		Agenda agenda = new Agenda();

		System.out.print("insira o nome: ");
		String nomeContato = entradaDados.nextLine();
		System.out.print("insira o telefone: ");
		String nomeTelefone = entradaDados.nextLine();
		
		Contato cont = new Contato(nomeContato, nomeTelefone);
		agenda.inserirContato(cont);
	}

	public static void procurarContato() {
		Scanner entradaDados = new Scanner(System.in);
		Agenda agenda = new Agenda();

		System.out.print("insira o nome do contato: ");
		String nome = entradaDados.nextLine();

		System.out.println(agenda.buscarContato(nome));
	}

	public static void exluirContato() {
		Scanner entrada = new Scanner(System.in);
		Agenda agenda = new Agenda();

		System.out.print("insira o nome escolhido para ser deletado: ");
		String nome = entrada.nextLine();
		agenda.removerContato(nome);
	}

	public static void listarContatos() {
		Agenda agenda = new Agenda();
		agenda.listarContatos();
	}

	public static void main(String[] args) {

		do {
			System.out.println("====================");
			System.out.println("        MENU        ");
			System.out.println("====================");
			System.out.print("1 - Adicionar contato" + "\n2 - Buscar Contato\n3 - remover contato\n4 - Listar contatos"
					+ "\n5 - sair\n====================\nescolha a opcao: ");
			Scanner entrada = new Scanner(System.in);
			int opcao = entrada.nextInt();
			switch (opcao) {
				case 1: {
					adicionarContato();
					break;
				}
				case 2: {
					procurarContato();
					break;
				}
				case 3: {
					exluirContato();
					break;
				}
				case 4: {
					listarContatos();
					break;
				}
				case 5: {
					entrada.close();
					System.exit(0);
				}
				default: {
					System.out.println("numero nao pertencente a lista de opcoes!");
				}
			}
		} while(true);
	}
}
