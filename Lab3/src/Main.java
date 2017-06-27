import java.util.Scanner;


public class Main {
	static Scanner leitor = new Scanner(System.in);	
	static ControleAcademico controle = new ControleAcademico();
	
	public static void main(String[] args){
		mostraMenu();
	}
	
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
			System.out.println("Opção> ");
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
				default:
					break;
			}
		}
		System.out.println("Ate mais!");
		leitor.close();
	}
	
	private static void menuConsulta(){
		String matricula;
		System.out.println("Matricula: ");
		matricula = leitor.nextLine();
		System.out.print("Aluno: ");
		System.out.println(controle.consultarAluno(matricula));
		System.out.println("");
		
	}
	
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
	
	private static void menuGrupo(){
		String nomeGrupo;
		
		System.out.println("Grupo: ");
		nomeGrupo = leitor.nextLine();
		System.out.println(controle.cadastrarGrupo(nomeGrupo));
		System.out.println("");
	}	
}
