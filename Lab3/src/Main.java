import java.util.Scanner;


public class Main {
	static Scanner leitor = new Scanner(System.in);	
	static ControleAcademico controle = new ControleAcademico();
	
	public static void main(String[] args){
		mostraMenu();
	}
	
	/**
	 * Mostra menu principal
	 */
	
	private static void mostraMenu(){
		
		String opcao = "";
		
		while(!opcao.equals("O")){
			System.out.println("(C)adastrar Aluno");
			System.out.println("(E)xibir Aluno");
			System.out.println("(N)ovo Grupo");
			System.out.println("(A)locar Aluno no Grupo e Imprimir Grupos");
			System.out.println("(R)egistrar Resposta de Aluno");
			System.out.println("(I)mprimir Alunos que Responderam");
			System.out.println("(O)ra, vamos fechar o programa!");
			System.out.println("Opcao> ");
			opcao = leitor.nextLine().toUpperCase();
		
			
			switch(opcao){
				case "C":
					menuCadastro();
					break;
				case "E":
					menuConsulta();
					break;
				case "N":
					menuGrupo();
					break;
				case "A":
					menuAlocarOuImprimir();
					break;
				case "R":
					registrarRespostaAluno();
					break;
				case "I":
					imprimirAlunos();
					break;
				default:
					break;
			}
		}
		System.out.println("Ate mais!");
		leitor.close();
	}
	
	/**
	 * Mostra menu de consulta de aluno
	 */
	
	private static void menuConsulta(){
		String matricula;
		System.out.println("Matricula: ");
		matricula = leitor.nextLine();
		System.out.print("Aluno: ");
		System.out.println(controle.consultarAluno(matricula));
		System.out.println("");
		
	}
	
	/**
	 * Mostra menu do cadastro de aluno
	 */
	private static void menuCadastro(){
		String matricula;
		String nome;
		String curso;
		
		System.out.println("");
		System.out.println("Matrícula: ");
		matricula = leitor.nextLine();
		
		System.out.println("Nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Curso: ");
		curso = leitor.nextLine();
		System.out.println(controle.cadastrarAluno(matricula, nome, curso));
		System.out.println("");
		
	}
	
	/**
	 * Mostra o menu de criacao do grupo
	 */
	
	private static void menuGrupo(){
		String nomeGrupo;
		
		System.out.println("Grupo: ");
		nomeGrupo = leitor.nextLine();
		System.out.println(controle.cadastrarGrupo(nomeGrupo));
		System.out.println("");
	}	
	
	/**
	 * Mostra menu de alocacao ou impressao de grupo
	 */
	private static void menuAlocarOuImprimir(){
		
		String opcao;
		String nomeGrupo;
		
		System.out.println("(A)locar Aluno ou (I)mprimir Grupo? ");
		opcao = leitor.nextLine();
		
		System.out.println("");
		
		switch(opcao.toUpperCase()){
			case "A":
				String matricula;
				
				System.out.println("Matricula: ");
				matricula = leitor.nextLine();
				
				System.out.println("Grupo: ");
				nomeGrupo = leitor.nextLine();
				String obj = controle.getObj(matricula, nomeGrupo);			
				System.out.println(obj);
				break;
			case "I":
				System.out.println("Grupos: ");
				nomeGrupo = leitor.nextLine();
				
				System.out.println("Alunos do grupo " + nomeGrupo + ": ");
				
				String alunosDoGrupo = controle.imprimirGrupo(nomeGrupo);
				System.out.println(alunosDoGrupo);
				break;
				
			default: 
				System.out.println("Opcao invalida.");
				System.out.println("");
				break;
		}	
		
	}
	
	private static void registrarRespostaAluno(){
		String matricula;
		System.out.println("Matricula: ");
		matricula = leitor.nextLine();
		String msg = controle.respondemQuestoes(matricula);
		System.out.println(msg);
	}
	
	public static void imprimirAlunos(){
		System.out.println(controle.listaResponderam());
	}
}
